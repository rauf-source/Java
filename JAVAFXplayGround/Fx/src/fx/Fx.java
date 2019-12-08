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
        window = stage;
        
        Label label1 = new Label ("Welcome to the first Scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e ->{
        window.setScene(scene2);
        });
        //layout 1-  children set in a vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,200,200);
        
        //button 2

        Button button2 =  new Button("Laugh bitch lauch");
        button2.setOnAction(e->{
              Label lab = new Label("Hahahaha");
           layout1.getChildren().add(lab);
        });
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        
        scene2 = new Scene(layout2,300,300);
        window.setScene(scene1);
        window.setTitle("bruh");
        window.show();
    }


}
