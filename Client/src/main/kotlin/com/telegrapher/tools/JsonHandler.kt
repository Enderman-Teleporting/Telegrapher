package com.telegrapher.tools

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

class JsonHandler {
    companion object {
        fun writeJson(jsonLine: String){
            val file= File("./loginData.json")
            if (!file.exists()){
                file.createNewFile()
            }
            val jsonWriter=BufferedWriter(FileWriter(file))
            jsonWriter.write(jsonLine)
        }
        fun formJson(isVerified: Boolean, account: String, password: String): String {
            return "{\n\t\"isVerified\":" + (if (isVerified) "true" else "false") + ",\n\t\"account\":" + account + ",\n\t\"password\":" + password+"\n}"
        }
    }

}