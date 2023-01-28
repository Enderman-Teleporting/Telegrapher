package Windows

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.*
import javafx.scene.layout.AnchorPane
import javafx.scene.text.Text

class EventHandler {
    @FXML
    private var ConfirmIP: Button? = null

    @FXML
    private var Reg_Page: AnchorPane? = null

    @FXML
    private var Help: Menu? = null

    @FXML
    private var Settings1: Menu? = null

    @FXML
    private var Author1: Menu? = null

    @FXML
    private var Leave: Menu? = null

    @FXML
    private var SwitchIP1: Menu? = null

    @FXML
    private var CancelSetting: Button? = null

    @FXML
    private var IPError: Text? = null

    @FXML
    private var BackGroudColor: ColorPicker? = null

    @FXML
    private var Setting_Page: AnchorPane? = null

    @FXML
    private var typerList: ListView<*>? = null

    @FXML
    private var Password2nd: TextField? = null

    @FXML
    private var Login_Pwd: TextField? = null

    @FXML
    private var WarnPwdLog: Text? = null

    @FXML
    private var TextColor: ColorPicker? = null

    @FXML
    private var CallsignReg: TextField? = null

    @FXML
    private var New_Account: Button? = null

    @FXML
    private var Settings: Menu? = null

    @FXML
    private var Exit: Menu? = null

    @FXML
    private var Password1st: TextField? = null

    @FXML
    private var IP: TextField? = null

    @FXML
    private var Login: Button? = null

    @FXML
    private var ChooseIP: AnchorPane? = null

    @FXML
    private var Repo1: Menu? = null

    @FXML
    private var room: AnchorPane? = null

    @FXML
    private var WarnCallsignLog: Text? = null

    @FXML
    private var ConfirmSetting: Button? = null

    @FXML
    private var Login_Callsign: TextField? = null

    @FXML
    private var Login_Page: AnchorPane? = null

    @FXML
    private var Repo: Menu? = null

    @FXML
    private var Register: Button? = null

    @FXML
    private var port: TextField? = null

    @FXML
    private var Volume: TextField? = null

    @FXML
    private var Pitch: TextField? = null

    @FXML
    private var Author: Menu? = null

    @FXML
    private var PwdDoNotMatchReg: Text? = null

    @FXML
    private var WarnCallsignReg: Text? = null

    @FXML
    private var Main_Page: AnchorPane? = null

    @FXML
    private var SwitchIP: Menu? = null

    @FXML
    private var Switch_Account: Menu? = null
    @FXML
    fun confirmIP(event: ActionEvent?) {
    }

    @FXML
    fun gotoregister(event: ActionEvent?) {
    }

    @FXML
    fun doLogin(event: ActionEvent?) {
    }

    @FXML
    fun doReg(event: ActionEvent?) {
    }

    @FXML
    fun author(event: ActionEvent?) {
    }

    @FXML
    fun repo(event: ActionEvent?) {
    }

    @FXML
    fun settings(event: ActionEvent?) {
    }

    @FXML
    fun switch_account(event: ActionEvent?) {
    }

    @FXML
    fun exit(event: ActionEvent?) {
    }

    @FXML
    fun switchIP(event: ActionEvent?) {
    }

    @FXML
    fun connect(event: ActionEvent?) {
    }

    @FXML
    fun space_pressed(event: ActionEvent?) {
    }

    @FXML
    fun space_released(event: ActionEvent?) {
    }

    @FXML
    fun author1(event: ActionEvent?) {
    }

    @FXML
    fun repo1(event: ActionEvent?) {
    }

    @FXML
    fun settings1(event: ActionEvent?) {
    }

    @FXML
    fun leave(event: ActionEvent?) {
    }

    @FXML
    fun help1(event: ActionEvent?) {
    }

    @FXML
    fun switchIP1(event: ActionEvent?) {
    }

    @FXML
    fun confirmSetting(event: ActionEvent?) {
    }

    @FXML
    fun cancelSetting(event: ActionEvent?) {
    }
}