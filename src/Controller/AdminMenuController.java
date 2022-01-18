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

public class AdminMenuController {
    public AnchorPane AdminMenuContext;

    public void ClickOnActionRm(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) AdminMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/RoomManagement.fxml"))));
    }

    public void ClickOnActionMp(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) AdminMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/MealPackages.fxml"))));
    }

    public void ClickOnActionIR(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) AdminMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/IncomeReports.fxml"))));
    }

    public void ClickOnActionAMHome(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) AdminMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Home.fxml"))));
    }

    public void ClickOnActionBack(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) AdminMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));

    }

    public void ClickOnActionLog(MouseEvent mouseEvent) throws IOException {
        Stage stage =(Stage) AdminMenuContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../View/Login.fxml"))));
    }
}


