package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginController {
    public ImageView HomeIco;
    public AnchorPane LoginContext;
    public TextField txtUserName;
    public PasswordField pwdPassword;

    int atmp=0;

    public void ClickOnAction(ActionEvent actionEvent) throws IOException {
        String tempUserName=txtUserName.getText();
        String  tempPassword=pwdPassword.getText();

        atmp++;

        if(atmp<=3){
            if(tempUserName.equals("admin")&& tempPassword.equals("1234")) {
                new Alert(Alert.AlertType.CONFIRMATION,"SuccessFully Logged In ! As an ADMIN").show();
                Stage stage =(Stage) LoginContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/AdminMenu.fxml"))));
            }else if(tempUserName.equals("user")&& tempPassword.equals("0000")){
                new Alert(Alert.AlertType.WARNING,"SuccessFully Logged In ! As a USER").show();
                Stage stage =(Stage) LoginContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/ReciptionistMenu.fxml"))));
            }else{
                new Alert(Alert.AlertType.WARNING,"Try Again !").show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING,"You're Blocked !").show();
            txtUserName.setEditable(false);
            pwdPassword.setEditable(false);
        }


    }

    public void ClickOnHome(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) LoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Home.fxml"))));
    }
}

