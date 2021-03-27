package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ScrollPane scrollPane = FXMLLoader.load(getClass().getResource("/gui/MainView.fxml"));

        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        primaryStage.setTitle("Hello World2");
        primaryStage.setScene(new Scene(scrollPane));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
