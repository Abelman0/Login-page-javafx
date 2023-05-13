/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package assignemntloginpage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author abel
 */
public class DashboardFXMLController implements Initializable {

    @FXML
    private Label username_label;
    @FXML
    private Button logout_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        username_label.setText(LoginFXMLController.loginUsername);
    }

    public void logoutBtn() throws IOException {
        LoginPage.sceneFactory("LoginFXML");
    }

}
