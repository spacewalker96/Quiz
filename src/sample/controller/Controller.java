package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private JFXButton startButton;

    //public void startAction(javafx.event.ActionEvent actionEvent) throws IOException {
    @FXML
    private void startAction() throws IOException {
        startButton.getScene().getWindow().hide();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/sample/view/n1.fxml"));
        Stage n1 = new Stage();
        n1.setTitle("Niveau 1");
        Scene scene = new Scene(root);
        n1.setScene(scene);
        n1.show();
        n1.setResizable(false);

        }



    }


