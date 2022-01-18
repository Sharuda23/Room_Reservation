package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminMenuController {
    public void ClickOnActionRm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/RoomManagement.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void ClickOnActionMp(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/MealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void ClickOnActionIR(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../View/IncomeReports.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void ClickOnActionAMHome(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../View/Home.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
