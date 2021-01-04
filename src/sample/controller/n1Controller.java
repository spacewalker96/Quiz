package sample.controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
public class n1Controller {
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

    @FXML
    private Label score;

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

    public void suivantaction() {

        }

    }






