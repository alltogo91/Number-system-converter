package application;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane grid = new GridPane();

			
			
			grid.setVgap(10);
			grid.setHgap(10);

			
			Label binLabel = new Label("Binär:");
			TextField binField = new TextField ();
			
			Label octLabel = new Label("Octal:");
			TextField octField = new TextField ();
			
			Label dezLabel = new Label("Dezimal:");
			TextField dezField = new TextField ();
			
			Label hexDezLabel = new Label("Hexa-Dezimal:");
			TextField hexDezField = new TextField ();
			
			//Label creatorLabel =new Label("Made by: Mike Kaupert, 2021");
			
			Button binCalcButton=new Button("Berechne");
			Button octCalcButton=new Button("Berechne");
			Button dezCalcButton=new Button("Berechne");
			Button hexDezCalcButton=new Button("Berechne");
			Button clearButton=new Button("Clear");
			
			
			GridPane.setConstraints(binLabel, 0, 0);
			GridPane.setConstraints(binField, 1, 0);
			GridPane.setConstraints(binCalcButton, 2, 0);
			GridPane.setConstraints(octLabel, 0, 1);
			GridPane.setConstraints(octField, 1, 1);
			GridPane.setConstraints(octCalcButton, 2, 1);
			GridPane.setConstraints(dezLabel, 0, 2);
			GridPane.setConstraints(dezField, 1, 2);
			GridPane.setConstraints(dezCalcButton, 2, 2);
			GridPane.setConstraints(hexDezLabel, 0, 3);
			GridPane.setConstraints(hexDezField, 1, 3);
			GridPane.setConstraints(hexDezCalcButton, 2, 3);
			GridPane.setConstraints(clearButton, 2, 4);
			//GridPane.setConstraints(creatorLabel, 0, 7);
			
			

			grid.getChildren().addAll(binLabel,binField);
			grid.getChildren().addAll(octLabel,octField);
			grid.getChildren().addAll(dezLabel,dezField);
			grid.getChildren().addAll(hexDezLabel,hexDezField);
			grid.getChildren().addAll(binCalcButton,octCalcButton,dezCalcButton,hexDezCalcButton);
			grid.getChildren().add(clearButton);
			//grid.getChildren().add(creatorLabel);
			
			

			Scene scene = new Scene(grid,400,300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("NumCon");
			primaryStage.sizeToScene();
			primaryStage.show();
			
			//Eventhandling
			//Clear all entry
			clearButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					binField.setText("");
					octField.setText("");
					dezField.setText("");
					hexDezField.setText("");
					
				}
				
			});
			
			
	        
	        //ActionHandler
			//Bin
			binCalcButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					
					int i = Integer.parseInt(binField.getText(), 2);
					
					String dezString = Integer.toString(i);
					dezField.setText(dezString);;
					
					String octString =Integer.toOctalString(i);
			        octField.setText(octString);
			        
					String hex = Integer.toHexString(i);
					hexDezField.setText(hex);
					
					
					
				}
			});
			
			//Dez
			dezCalcButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					Integer i = Integer.parseInt(dezField.getText(),10);
					
					String binString = Integer.toBinaryString(i);
					binField.setText(binString);
					
					String octString =Integer.toOctalString(i);
			        octField.setText(octString);
			        
					String hex = Integer.toHexString(i);
					hexDezField.setText(hex);
					
					
					
			         
			           
			        }
				
			});
			
			//Oct
			octCalcButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					Integer i = Integer.parseInt(octField.getText(),8);
					
					String binString = Integer.toBinaryString(i);
					binField.setText(binString);
					
					String dezString =Integer.toString(i);
			        dezField.setText(dezString);
			        
					String hex = Integer.toHexString(i);
					hexDezField.setText(hex);
					
					
					
			         
			           
			        }
				
			});
			
			//HexDez
			hexDezCalcButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent arg0) {
					
					
					 
					 int i = Integer.parseInt(hexDezField.getText(), 16);
						
						String dezString = Integer.toString(i);
						dezField.setText(dezString);;
						
						String octString =Integer.toOctalString(i);
				        octField.setText(octString);
				        
				        String binString = Integer.toBinaryString(i);
						binField.setText(binString);
					  
					
				}
			});
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
