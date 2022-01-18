package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomManagementController {
    public AnchorPane RoomManagementContext;

    public void HomeOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomManagementContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Home.fxml"))));
    }

    public void BackClickOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomManagementContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/AdminMenu.fxml"))));
    }

    public void LoginOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) RoomManagementContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));
    }
}
