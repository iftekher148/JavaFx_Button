package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class javafxbutton extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	  
        primaryStage.setTitle("Calculator");
        Button btn = new Button();
        Button btn2= new Button();
        Button btn3 = new Button();
        Button btn4= new Button();
        btn.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("1");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("2");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("3");
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("4");
            }
        });
        HBox hbox = new HBox();
        hbox.getChildren().addAll(btn, btn2,btn3,btn4);
        btn.setPrefSize(100, 20);
        btn2.setPrefSize(100, 20);
        btn3.setPrefSize(100, 20);
        btn4.setPrefSize(100, 20);
        primaryStage.setScene(new Scene(hbox, 300, 250));
        primaryStage.show();
    }
}

