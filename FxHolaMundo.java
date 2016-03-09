import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FxHolaMundo extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage){
    primaryStage.setTitle("Hola Mundo FX");

    Group root = new Group();
    Scene scene = new Scene(root,300,250);
    Button btn = new Button();
    btn.setLayoutX(100);
    btn.setLayoutY(80);
    btn.setText("Hola Mundo");

    btn.setOnAction(e -> System.out.println("Hola perras"));
    root.getChildren().add(btn);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
