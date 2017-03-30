package guiCalc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalcView extends Application
{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	

    	
        primaryStage.setTitle("Calculator");
        
        TextField userText = new TextField();
        TextField entryText = new TextField();
        
        VBox mainPane = new VBox(20);
        GridPane grid = new GridPane();
        VBox textPane = new VBox();
        
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button dec = new Button (".");
        Button btnAdd = new Button("+");
        Button btnSub = new Button("-");
        Button btnMul = new Button("*");
        Button btnDiv = new Button("/");
        Button clear = new Button ("C");
        Button emptyButton1 = new Button (" ");
        Button emptyButton2 = new Button (" ");
        Button emptyButton3 = new Button (" ");
        Button equal = new Button ("=");
        
        
        userText.setPrefWidth(220);
        userText.setPrefHeight(50);
        
        entryText.setPrefWidth(220);
        entryText.setPrefHeight(50);
        
       emptyButton1.setPrefWidth(50);
       emptyButton2.setPrefWidth(50);
       emptyButton3.setPrefWidth(50);
       btn0.setPrefWidth(50);
       btn1.setPrefWidth(50);
       btn2.setPrefWidth(50);
       btn3.setPrefWidth(50);
       btn4.setPrefWidth(50);
       btn5.setPrefWidth(50);
       btn6.setPrefWidth(50);
       btn7.setPrefWidth(50);
       btn8.setPrefWidth(50);
       btn9.setPrefWidth(50);
       btnAdd.setPrefWidth(50);
       btnSub.setPrefWidth(50);
       btnDiv.setPrefWidth(50);
       btnMul.setPrefWidth(50);
       dec.setPrefWidth(50);
       clear.setPrefWidth(50);
       equal.setPrefWidth(50);
       
       emptyButton1.setPrefHeight(50);
       emptyButton2.setPrefHeight(50);
       emptyButton3.setPrefHeight(50);
       btn0.setPrefHeight(50);
       btn1.setPrefHeight(50);
       btn2.setPrefHeight(50);
       btn3.setPrefHeight(50);
       btn4.setPrefHeight(50);
       btn5.setPrefHeight(50);
       btn6.setPrefHeight(50);
       btn7.setPrefHeight(50);
       btn8.setPrefHeight(50);
       btn9.setPrefHeight(50);
       btnAdd.setPrefHeight(50);
       btnSub.setPrefHeight(50);
       btnDiv.setPrefHeight(50);
       btnMul.setPrefHeight(50);
       dec.setPrefHeight(50);
       clear.setPrefHeight(50);
       equal.setPrefHeight(50);
        
        grid.setPadding(new Insets(5));
        grid.setHgap(5);
        grid.setVgap(5);
        

        grid.add(emptyButton1, 2, 1);
        grid.add(emptyButton2, 3, 1);
        grid.add(emptyButton3, 3, 5);
        grid.add(clear, 1, 1);
        grid.add(dec, 1, 5);
        grid.add(btn0, 2, 5);
        grid.add(btn1, 1, 4);
        grid.add(btn2, 2, 4);
        grid.add(btn3, 3, 4);
        grid.add(btn4, 1, 3);
        grid.add(btn5, 2, 3);
        grid.add(btn6, 3, 3);
        grid.add(btn7, 1, 2);
        grid.add(btn8, 2, 2);
        grid.add(btn9, 3, 2);
        grid.add(btnAdd, 4, 4);
        grid.add(btnSub, 4, 3);
        grid.add(btnMul, 4, 2);
        grid.add(btnDiv, 4, 1);
        grid.add(equal, 4, 5);
        
        textPane.getChildren().addAll(userText,entryText);
        
        clear.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent event) {
                userText.clear();
                entryText.clear();
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                userText.appendText("1");
                entryText.appendText("1");
            }
        });
         btn2.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("2");
                 entryText.appendText("2");
             }
         });
         btn3.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("3");
                 entryText.appendText("3");
             }
         });
         btn4.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("4");
                 entryText.appendText("4");
             }
         });
         btn5.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("5");
                 entryText.appendText("5");
             }
         });
         btn6.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("6");
                 entryText.appendText("6");
             }
         });
         btn7.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("7");
                 entryText.appendText("7");
             }
         });
         btn8.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("8");
                 entryText.appendText("8");
             }
         });
         btn9.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("9");
                 entryText.appendText("9");
             }
         });
         btn0.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText("0");
                 entryText.appendText("0");
             }
         });
         dec.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 userText.appendText(".");
                 entryText.appendText(".");
             }
         });
         btnAdd.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) 
			{
				entryText.appendText("+");
				float number1 = Float.parseFloat(userText.getText());
				userText.clear();
				equal.setOnAction(new EventHandler<ActionEvent>()
						{
							@Override
							public void handle(ActionEvent arg0) {
								entryText.appendText("=");
								float number2 = Float.parseFloat(userText.getText());
								userText.clear();
								float answer = number1 + number2;
								userText.setText(String.valueOf(answer));
								entryText.appendText(String.valueOf(answer));
							}
					
						});
			}   	    	 
         });
        btnSub.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) 
			{
				entryText.appendText("-");
				float number1 = Float.parseFloat(userText.getText());
				userText.clear();
				equal.setOnAction(new EventHandler<ActionEvent>()
						{
							@Override
							public void handle(ActionEvent arg0) {
								entryText.appendText("=");
								float number2 = Float.parseFloat(userText.getText());
								userText.clear();
								float answer = number1 - number2;
								userText.setText(String.valueOf(answer));
								entryText.appendText(String.valueOf(answer));
							}
					
						});
			}   	    	 
         });
         btnMul.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) 
			{
				entryText.appendText("*");
				float number1 = Float.parseFloat(userText.getText());
				userText.clear();
				equal.setOnAction(new EventHandler<ActionEvent>()
						{
							@Override
							public void handle(ActionEvent arg0) {
								entryText.appendText("=");
								float number2 = Float.parseFloat(userText.getText());
								userText.clear();
								float answer = number1 * number2;
								userText.setText(String.valueOf(answer));
								entryText.appendText(String.valueOf(answer));
							}
					
						});
			}   	    	 
         });
         
         btnDiv.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) 
			{
				entryText.appendText("/");
				float number1 = Float.parseFloat(userText.getText());
				userText.clear();
				equal.setOnAction(new EventHandler<ActionEvent>()
						{
							@Override
							public void handle(ActionEvent arg0) {
								entryText.appendText("=");
								float number2 = Float.parseFloat(userText.getText());
								userText.clear();
								float answer = number1 / number2;
								userText.setText(String.valueOf(answer));
								entryText.appendText(String.valueOf(answer));
							}
					
						});
			}   	    	 
         });
         btnAdd.setOnKeyPressed(event ->
         {
        	if(event.getCode().equals(KeyCode.PLUS))
        	{
        		float number1 = Float.parseFloat(userText.getText());
				userText.clear();
				equal.setOnAction(new EventHandler<ActionEvent>()
						{
							@Override
							public void handle(ActionEvent arg0) {
								float number2 = Float.parseFloat(userText.getText());
								userText.clear();
								float answer = number1 + number2;
								userText.setText(String.valueOf(answer));
							}
						});
        	}
         });
         
         //textPane.setAlignment(Pos.CENTER);
         //userText.setAlignment(Pos.TOP_CENTER);

        mainPane.getChildren().addAll(textPane,grid);
        mainPane.prefWidthProperty().bind(primaryStage.widthProperty());
        primaryStage.setScene(new Scene(mainPane, 250, 300));
        primaryStage.show();
    }
}

