/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author utku27
 */
public class Panaderia extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Button pan = new Button ("Pan");
        Button dulce = new Button ("Dulces");
        Button salado = new Button ("Salados");
        pan.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        StackPane root = new StackPane();
        HBox up = new HBox();
        GridPane middle = new GridPane();
        HBox bottom = new HBox();
        
        up.getChildren().add(pan);
        up.getChildren().add(dulce);
        up.getChildren().add(salado);
        
        
        root.
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Panaderia");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
