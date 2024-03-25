package lk.ijse.dep12.media_player.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    public Button btnClose;
    public AnchorPane root;

    public void CloseOnAction(ActionEvent actionEvent) {
        ((Stage)root.getScene().getWindow()).close();
    }

    public void AboutOnAction(ActionEvent actionEvent) throws IOException {
        Scene mainScene = new Scene(FXMLLoader.load(getClass().getResource("/view/AboutView.fxml")));
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(mainScene);
    }
}
