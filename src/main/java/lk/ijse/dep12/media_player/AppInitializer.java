package lk.ijse.dep12.media_player;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Scene mainScene = new Scene(FXMLLoader.load(getClass().getResource("/view/MainView.fxml")));
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(mainScene);
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}
