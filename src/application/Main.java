package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;

    public static void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(Main.class.getResource("/fxml/" + fxml));
        stage.setScene(new Scene(pane));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));

        primaryStage.setTitle("Sistema de Barbearia");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//--module-path "C:\Users\DELL\Downloads\openjfx-21.0.9_windows-x64_bin-sdk\javafx-sdk-21.0.9\lib" --add-modules javafx.controls,javafx.fxml
