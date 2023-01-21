package com.typer.telegrapher.Windows

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField

class EventHandler {
    @FXML
    private var msg: Button? = null

    @FXML
    private var exit: Button? = null

    @FXML
    private var txtMsg: Label?=null

    @FXML
    private var Port: TextField?=null

    @FXML
    private var Connect: Button? = null

    @FXML
    private var RepoLoc: Button? = null

    @FXML
    private var License: Button? = null

    @FXML
    private var AuthorInfo: Button? = null

    @FXML
    private var txtConnect: Label? = null
    @FXML
    fun onConnectClick(event: ActionEvent?) {
    }

    @FXML
    fun onMsgClick(event: ActionEvent?) {
    }

    @FXML
    fun onExitClick(event: ActionEvent?) {
    }

    @FXML
    fun onAuthorInfoClick(event: ActionEvent?) {
    }

    @FXML
    fun onRepoLocationClick(event: ActionEvent?) {
    }

    @FXML
    fun onLicenseClick(event: ActionEvent?) {
    }
}