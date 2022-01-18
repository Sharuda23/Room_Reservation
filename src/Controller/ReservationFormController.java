package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservationFormController {
    public AnchorPane RoomReservationContext;

    public void HomeClickOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomReservationContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Home.fxml"))));
    }

    public void LoginClickOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomReservationContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));
    }

    public void BackClickOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomReservationContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/ReciptionistMenu.fxml"))));
    }
}
