import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.geometry.*;



public class LoginFondo extends Application {
	
	public static void main (String[] args) {
		Application.launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Bienvenidos a JavaFX");
		
		//GridPane Layout
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding( new Insets(25,25,25,25));
		
		
		
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("tahoma",FontWeight.NORMAL,20));
		//Se asigna un Id para que lo identifique el css
		sceneTitle.setId("welcome-text");
		
		grid.add(sceneTitle, 0,0,2,1);
		
		Label userName = new Label("User Name");
		grid.add(userName,0,1);
		
		TextField userTextField = new TextField();
		grid.add(userTextField, 1,1);
		
		Label pw = new Label("Password");
		grid.add(pw,0,2);
		
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1,2);
		
		
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1 , 4);
		
		final Text actiontarget = new Text();
		grid.add(actiontarget, 1,6);
		
		//Se asigna un Id para el css
		actiontarget.setId("actiontarget");
		
		btn.setOnAction( e -> {
			actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in button pressed");
            } 
          );
		
		Scene scene = new Scene(grid,350,275);
		
		//Se define una hoja en estilo en cascada
		scene.getStylesheets().add(
		     Login.class.getResource("Login.css").toExternalForm());
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
