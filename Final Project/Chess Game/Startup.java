package chessgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 Author: John Lopez
 Date: 2/27/21
 */

public class Startup extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("board/ChessBoard.fxml"));
        
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Chess Game");
	    stage.getIcons().add(new Image(".resources/Crown100.png"));
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}