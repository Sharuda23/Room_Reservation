package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RecptionistMenuController {
    public AnchorPane ReceptionistMenuContext;

    public void ClickOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) ReceptionistMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/RoomStatus.fxml"))));
    }

    public void ClickOnActionRes(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) ReceptionistMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/ReservationForm.fxml"))));
    }

    public void HomeOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) ReceptionistMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Home.fxml"))));
    }

    public void LoginOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) ReceptionistMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));
    }

    public void BackOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) ReceptionistMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));
    }
}
