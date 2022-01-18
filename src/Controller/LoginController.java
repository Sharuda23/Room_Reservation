package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    String Admin="amin";
    public void ClickOnAction(ActionEvent actionEvent) throws IOException {
        if(Admin == "admin") {
            Stage stage =(Stage) LoginContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/AdminMenu.fxml"))));
        }else{
            Stage stage =(Stage) LoginContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/ReciptionistMenu.fxml"))));
        }
    }

    public void ClickOnHome(MouseEvent mouseEvent) {
    }
}

