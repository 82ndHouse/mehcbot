package sample;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //this just loads the description of the scene from sample.fxml
        primaryStage.setTitle("MEHC-B");
       primaryStage.setScene(new Scene(root, 500, 650));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
