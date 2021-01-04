package sample.controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class n1Controller {
    int score1 = 0;
    @FXML
    private Label score;
    @FXML
    private AnchorPane n1q5;

    @FXML
    private AnchorPane n1q4;

    @FXML
    private AnchorPane n1q3;

    @FXML
    private AnchorPane n1q2;

    @FXML
    private AnchorPane n1q1;

    @FXML
    private  JFXButton suivantbtn;
    @FXML
    private JFXButton q1;

    @FXML
    private JFXButton q2;

    @FXML
    private JFXButton q3;

    @FXML
    private JFXButton q4;

    @FXML
    private JFXButton q5;

    @FXML
    private JFXCheckBox chbx;
    @FXML
    private JFXCheckBox correct;

    private int s = 0;
    @FXML
    void q1() {

        q1.setOnAction(e -> n1q1.toFront());
    }

    @FXML
    void q2() {
        q2.setOnAction(e -> n1q2.toFront());
    }
    @FXML
    void q3() {
        q3.setOnAction(e -> n1q3.toFront());
    }
    @FXML
    void q4() {
        q4.setOnAction(e -> n1q4.toFront());
    }
    @FXML
    void q5() {
        q5.setOnAction(e -> n1q5.toFront());
    }
   /* private void initialize(){
       if(correct.selectedProperty())
    }*/

   /* public void startAction2() {

        }
*/

    //public void startAction(javafx.event.ActionEvent actionEvent) throws IOException {
    @FXML
    private void startAction2() throws IOException {
        suivantbtn.getScene().getWindow().hide();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/sample/view/n2.fxml"));
        Stage n2 = new Stage();
        n2.setTitle("Niveau 2");
        Scene scene = new Scene(root);
        n2.setScene(scene);
        n2.show();
        n2.setResizable(false);
        score.setText("vcbnb");

    }
    }






