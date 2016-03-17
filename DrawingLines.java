import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawingLines extends Application{
  @Override
  public void start(Stage primaryStage){
    primaryStage.setTitle("Unid 3 drawing lines");
    Group root = new Group();
    Scene scene = new Scene(root,300,150,Color.GRAY);

    //Red line
    Line redLine = new Line(10,10,200,10);
    //Setting commono propertoes
    redLine.setStroke(Color.RED);
    redLine.setStrokeWidth(10);
    redLine.setStrokeLineCap(StrokeLineCap.BUTT);
    //Crating a dashed patern
    redLine.getStrokeDashArray().addAll(10d,5d,15d,5d,20d);
    redLine.setStrokeDashOffset(0);
    root.getChildren().add(redLine);

    //white line
    Line whiteLine = new Line(10,30,200,30);
    whiteLine.setStroke(Color.WHITE);
    whiteLine.setStrokeWidth(10);
    whiteLine.setStrokeLineCap(StrokeLineCap.ROUND);
    root.getChildren().add(whiteLine);

    //Blue line
    Line blueLine = new Line(10,50,200,50);
    blueLine.setStroke(Color.BLUE);
    blueLine.setStrokeWidth(10);
    root.getChildren().add(blueLine);

    //slider ,om. max and current value
    Slider slider = new Slider(0,100,0);
    slider.setLayoutX(10);
    slider.setLayoutY(95);
    //Bind the stroke dash offset property
    redLine.strokeDashOffsetProperty().bind(slider.valueProperty());
    root.getChildren().add(slider);
    Text offsetText = new Text("Stroke dash offset: 0.0");
    offsetText.setX(10);
    offsetText.setY(80);
    offsetText.setStroke(Color.WHITE);

    //display stroke dash offset value
    slider.valueProperty().addListener((ov,curVal,newVal) -> offsetText.setText("Stroke Dash offset: " + slider.getValue()));
    root.getChildren().add(offsetText);

    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
