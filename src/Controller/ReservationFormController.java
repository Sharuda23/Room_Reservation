package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservationFormController {
    public AnchorPane RoomReservationContext;
    public TextField txtRoomType;
    public TextField txtMealPackage;
    public ComboBox<String> CmbRoomType;
    public ComboBox<String> CmbMealPlan;

    public void initialize(){
        CmbRoomType.getItems().add("Single");
        CmbRoomType.getItems().add("Double");
        CmbRoomType.getItems().add("Triple");
        CmbRoomType.getItems().add("Quad");

        CmbMealPlan.getItems().add("Local Package");
        CmbMealPlan.getItems().add("Chinese Package");
        CmbMealPlan.getItems().add("French Package");

        CmbRoomType.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtRoomType.setText(newValue);
        });

        CmbMealPlan.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtMealPackage.setText(newValue);
        });
    }

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

    public void SaveOnAction(ActionEvent actionEvent) {
        txtRoomType.setText(CmbRoomType.getValue());
        txtMealPackage.setText(CmbMealPlan.getValue());
    }

    public void PayOnAction(ActionEvent actionEvent) {
    }
}
