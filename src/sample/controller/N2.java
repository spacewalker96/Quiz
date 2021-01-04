package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class N2 {

    static int score1 = 0;

    @FXML
    private Label score;

    public void scoring(){
        score1+=40;
        score.setText("score: "+ score1);
    }



}

