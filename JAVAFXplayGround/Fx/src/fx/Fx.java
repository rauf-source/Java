/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;


/**
 *
 * @author Admin
 */
public class Fx extends Application {

    /**
     * @param args the command line arguments
     */
    Stage window;
    Scene scene1,scene2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
      TextField nameInput = new TextField();
       Button button = new Button("CLIKE ME");
       
       
       //
       VBox layout = new VBox(10);
       
       layout.setPadding(new Insets(20,20,20,20));
       layout.getChildren().addAll(nameInput, button);
       
       Scene scene = new Scene(layout, 250,250);
       stage.setScene(scene);
       stage.show();
        
    }

}
