import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import je.fx.util.Turtle;
import javafx.scene.canvas.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;


public class turtleaufdemeis extends Application {
  // Anfang Attribute
  private Turtle turtle1 = new Turtle();
  private Button button1 = new Button();
  private Button button2 = new Button();
  private Button button3 = new Button();
  private Button button4 = new Button();
  private Button button5 = new Button();
  private Button button6 = new Button();
  private Button button7 = new Button();
  private Button button8 = new Button();
  private Button button9 = new Button();
  private Label label1 = new Label();
  private Text text1 = new Text();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 692, 468);
    // Anfang Komponenten
    
    turtle1.setLayoutX(199);
    turtle1.setLayoutY(168);
    turtle1.setAnimated(true);
    turtle1.setWidth(244);
    turtle1.setHeight(100);
    turtle1.setOriginX(122);
    turtle1.setOriginY(50);
    root.getChildren().add(turtle1);
    button1.setLayoutX(5);
    button1.setLayoutY(8);
    button1.setPrefHeight(25);
    button1.setPrefWidth(75);
    button1.setOnAction(
      (event) -> {button1_Action(event);} 
    );
    button1.setText("start");
    root.getChildren().add(button1);
    button2.setLayoutX(5);
    button2.setLayoutY(40);
    button2.setPrefHeight(25);
    button2.setPrefWidth(75);
    button2.setOnAction(
      (event) -> {button2_Action(event);} 
    );
    button2.setText("bestenliste");
    root.getChildren().add(button2);
    button3.setLayoutX(5);
    button3.setLayoutY(75);
    button3.setPrefHeight(25);
    button3.setPrefWidth(75);
    button3.setOnAction(
      (event) -> {button3_Action(event);} 
    );
    button3.setText("ende");
    root.getChildren().add(button3);
    button4.setLayoutX(478);
    button4.setLayoutY(339);
    button4.setPrefHeight(25);
    button4.setPrefWidth(75);
    button4.setOnAction(
      (event) -> {button4_Action(event);} 
    );
    root.getChildren().add(button4);
    button5.setLayoutX(479);
    button5.setLayoutY(287);
    button5.setPrefHeight(25);
    button5.setPrefWidth(75);
    button5.setOnAction(
      (event) -> {button5_Action(event);} 
    );
    root.getChildren().add(button5);
    button6.setLayoutX(403);
    button6.setLayoutY(313);
    button6.setPrefHeight(25);
    button6.setPrefWidth(75);
    button6.setOnAction(
      (event) -> {button6_Action(event);} 
    );
    root.getChildren().add(button6);
    button7.setLayoutX(552);
    button7.setLayoutY(313);
    button7.setPrefHeight(25);
    button7.setPrefWidth(75);
    button7.setOnAction(
      (event) -> {button7_Action(event);} 
    );
    root.getChildren().add(button7);
    button8.setLayoutX(590);
    button8.setLayoutY(435);
    button8.setPrefHeight(25);
    button8.setPrefWidth(75);
    button8.setOnAction(
      (event) -> {button8_Action(event);} 
    );
    button8.setText("�berspring");
    root.getChildren().add(button8);
    button9.setLayoutX(512);
    button9.setLayoutY(8);
    button9.setPrefHeight(25);
    button9.setPrefWidth(163);
    button9.setOnAction(
      (event) -> {button9_Action(event);} 
    );
    button9.setText("spiel abbrechen");
    root.getChildren().add(button9);
    label1.setLayoutX(559);
    label1.setLayoutY(152);
    label1.setPrefHeight(20);
    label1.setPrefWidth(110);
    label1.setText("text");
    root.getChildren().add(label1);
    text1.setX(552);
    text1.setY(136);
    text1.setText("level");
    root.getChildren().add(text1);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("turtleaufdemeis");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public turtleaufdemeis
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void button1_Action(Event evt) {
    turtle1.move(60);
    turtle1.move(60);
    
  } // end of button1_Action

  public void button2_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button2_Action

  public void button3_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button3_Action

  public void button4_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button4_Action

  public void button5_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button5_Action

  public void button6_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button6_Action

  public void button7_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button7_Action

  public void button8_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button8_Action

  public void button9_Action(Event evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of button9_Action

  // Ende Methoden
} // end of class turtleaufdemeis

