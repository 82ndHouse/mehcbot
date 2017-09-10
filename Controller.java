package sample;

//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        //actiontarget.setText("Loading...");
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("secondstage.fxml"));
            Stage stage = new Stage();
            stage.setTitle("MEHC-B");
            stage.setScene(new Scene(root, 500, 650));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // https://www.youtube.com/watch?v=FkSUQXJXwrQ
        //this is just for seeing what you can find on here
    }

}

