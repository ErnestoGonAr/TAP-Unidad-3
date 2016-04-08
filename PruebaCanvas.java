import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PruebaCanvas extends Application{

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage){
    //crea el canvas
    Canvas canvas = new Canvas(300,100);

    //Obtener el graphics context del canvas
    GraphicsContext gc = canvas.getGraphicsContext2D();

    //Color y tipo de linea
    gc.setLineWidth(2.0);
    gc.setFill(Color.RED);

    //rectangulo
    //StrokeRoundRect(double x, double y, double w, double h, double la verga)
    //arcWidth, double arcHeight);
    gc.strokeRoundRect(10,10,50,50,10,10);

    //Ovaloo
    //fillOval(double x, double y, double w, double h);
    gc.fillOval(70,10,50,20);

    //Texto
    gc.strokeText("Hola canvas", 150,20);

    Pane root = new Pane();
    root.getChildren().add(canvas);
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Dibujando sobre un lienzo");
    stage.show();
  }

}
