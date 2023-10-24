package application;
import javafx.application.Platform; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn6;
	Button btn4;
	Button btn5;
	
	TextField textField1;
	Label label;
	HBox box1;
	HBox box2;
	
	
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager DM;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		
		//student Task #2:
		
		
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		btn1 = new Button("Hello");
		btn2 = new Button("Howdy");
		btn3 = new Button("Chinese");
		btn6 = new Button("Amharic");
		btn4 = new Button("Clear");
		btn5 = new Button("Exit");
		textField1 = new TextField();
		label = new Label("Feedback");
		box1 = new HBox();
		box2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		DM = new DataManager();
		btn1.setOnAction(new ButtonHandler());
		btn2.setOnAction(new ButtonHandler());
		btn3.setOnAction(new ButtonHandler());
		btn6.setOnAction(new ButtonHandler());
		btn4.setOnAction(new ButtonHandler());
		btn5.setOnAction(new ButtonHandler());
		
		box1.setAlignment(Pos.CENTER);
		box2.setAlignment(Pos.CENTER);
		
		HBox.setMargin(btn1, new Insets(20,4,20,4));
		HBox.setMargin(btn2, new Insets(20,4,20,4));
		HBox.setMargin(btn3, new Insets(20,4,20,4));
		HBox.setMargin(btn6, new Insets(20,4,20,4));
		HBox.setMargin(btn4, new Insets(20,4,20,4));
		HBox.setMargin(btn5, new Insets(20,4,20,4));
		
		//student Task #3:
		
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		box1.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6);
		box2.getChildren().addAll(textField1,label);
		getChildren().addAll(box1,box2);
	}
	//Task #4:
	//  create a private inner class to handle the button clicks
		
	private class ButtonHandler implements EventHandler<ActionEvent>{
		
		public void handle(ActionEvent e) {
			
			
			
			if(e.getTarget()==btn1) {
				
				textField1.setText(DM.getHello());
			}
			else if(e.getTarget()==btn2) {
				textField1.setText(DM.getHowdy());
			}
			else if(e.getTarget()==btn3) {
				textField1.setText(DM.getChinese());
			}
			else if(e.getTarget()==btn4) {
				textField1.setText("");
			}
			else if(e.getTarget()==btn5) {
				System.exit(0);
			}
			else if(e.getTarget()==btn6) {
				textField1.setText(DM.getAmharic());
			}
			
			
		}
	
	}
	
}
	
