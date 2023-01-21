import requests
import urllib
import os
import json
from zipfile import ZipFile
from tqdm import *
def download(url,path=""):
    def support_gbk(zip_file: ZipFile):
        name_to_info = zip_file.NameToInfo
        for name, info in name_to_info.copy().items():
            real_name = name.encode(" cp437 ").decode(" gbk ")
            if real_name != name:
                info.filename = real_name
                del name_to_info[name]
                name_to_info[real_name] = info
        return zip_file
    def unzip(file,path):
        file=file.replace("\\", "/")
        if (file[-1] == "/"):
            url = file[:-1]
        with support_gbk(ZipFile(file)) as zfp:
            zfp.extractall(path)
    url=url.replace("\\","/")
    path=path.replace("\\", "/")
    if(url[-1]=="/"):
        url=url[:-1]
    try:
        if (path[-1] != "/"):
            path = path+"/"
    except:
        if False:
            print()
    file = path + url[url.rfind("/") + 1:]
    url = urllib.parse.unquote(url)
    r = requests.get(url,stream=True)
    total=int(r.headers.get('content-length',0))
    with open(file, 'wb') as f, tqdm(desc=file,total=total, unit='iB',unit_scale=True, unit_divisor=1024, ) as bar:
        for data in r.iter_content(chunk_size=1024):
            size = f.write(data)
            bar.update(size)
    if(file.endswith(".zip")):
        unzip(file,path)
        os.remove(file)
def get_version(url,repository):
    text = json.loads(requests.get(url).text)
    return text['repositories'][repository]
def compare_version(lastest_version,now_version):
    if (lastest_version == 'null'):
        return False
    if(now_version=='null'):
        return True
    if(int(now_version[:now_version.find(".")])<int(lastest_version[:lastest_version.find(".")])):
        return True
    elif (int(now_version[:now_version.find(".")]) > int(lastest_version[:lastest_version.find(".")])):
        return False
    else:
        if (int(now_version[now_version.find(".")+1:now_version.rfind(".")]) < int(lastest_version[lastest_version.find(".")+1:lastest_version.rfind(".")])):
            return True
        elif (int(now_version[now_version.find(".")+1:now_version.rfind(".")]) > int(lastest_version[lastest_version.find(".")+1:lastest_version.rfind(".")])):
            return False
        else:
            if (int(now_version[now_version.rfind(".")+1:]) < int(lastest_version[lastest_version.rfind(".")+1:])):
                return True
            else:
                return False
with open("安装包.json","r") as file:
    j=json.loads(file.read())
lastest_version=get_version(j["version_num"],j["repository"])
now_version=j["now_version"]
if lastest_version=="null":
    print("暂无发行版本，敬请期待……")
elif now_version=="null":
    print("欢迎使用！")
    whether_to_install=input("确定要安装吗？(Y/N):")
    if whether_to_install.upper()=="Y":
        path=input("安装路径(默认值为{}):".format(j["path"]))
        if(path==""):
            path=j["path"]
        j["path"]=path
        install_version="v"+lastest_version
        try:
            download(j["file"].replace("<version>",install_version).replace("<repository>",j["repository"]),path)
            j["now_version"]=lastest_version
            print("安装成功！")
        except KeyboardInterrupt:
            print("安装已取消！")
        except:
            print("安装失败！")

    else:
        print("安装已取消！")
else:
    if(compare_version(lastest_version,now_version)):
        print("检测到新版本:v"+lastest_version)
        whether_to_install = input("确定要更新吗？(Y/N):")
        if whether_to_install.upper() == "Y":
            path = j["path"]
            install_version = "v" + lastest_version
            try:
                download(j["file"].replace("<version>", install_version).replace("<repository>", j["repository"]), path)
                j["now_version"] = lastest_version
                print("更新成功！")
            except KeyboardInterrupt:
                print("更新已取消！")
            except:
                print("更新失败！")
        else:
            print("更新已取消！")
    else:
        print("已是最新版本！")
with open("安装包.json","w") as file:
    file.write(json.dumps(j))
input()



