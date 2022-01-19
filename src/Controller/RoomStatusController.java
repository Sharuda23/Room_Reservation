package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomStatusController {
    public AnchorPane RoomStatusContext;
    public ComboBox<String> CmbRoomStatus;

    public void initialize(){
        CmbRoomStatus.getItems().add("Available");
        CmbRoomStatus.getItems().add("Under Maintenance");

        CmbRoomStatus.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

        });
    }

    public void BackOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomStatusContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/ReciptionistMenu.fxml"))));
    }

    public void LoginOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomStatusContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));
    }

    public void HomeOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomStatusContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Home.fxml"))));
    }
}
