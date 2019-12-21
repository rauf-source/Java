/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/**
 *
 * @author Admin
 */
public class AlertBox {
    
    public static void display(String title, String msg){
        Stage stage = new Stage();
       
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);
        
        Label label =  new Label();
        label.setText(msg);
        Button closeButton = new Button("Close me baby");
        closeButton.setOnAction(event->stage.close());
            VBox layout = new VBox(10);
            layout.getChildren().addAll(label,closeButton);
            label.setAlignment(Pos.CENTER);
            
            Scene scene = new Scene(layout);
            stage.setScene(scene);
            stage.showAndWait();
        
    }
    
    
}
