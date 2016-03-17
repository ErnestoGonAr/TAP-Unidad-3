import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class VariasFormas extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage){
    //crea un circulo con area amarilla, perimetro negro y trazo de 2 px
    Circle circulo = new Circle(40);
    circulo.setFill(Color.YELLOW);
    circulo.setStroke(Color.BLACK);
    circulo.setStrokeWidth(2.0);

    //Crear un rectangulo
    Rectangle rect = new Rectangle(100,75);
    rect.setFill(Color.RED);

    //Crear una linea
    Line linea = new Line(0,0,50,50);
    linea.setStrokeWidth(5.0);
    linea.setStroke(Color.GREEN);

    //Crear un paralelogramo
    Polygon figurax = new Polygon();
    figurax.getPoints().addAll(50.0,0.0,100.0,0.0,100.0);
    figurax.setFill(Color.AZURE);
    figurax.setStroke(Color.BLACK);

    //crear un hexagono
    Polyline hexagono = new Polyline(
    80.0,0.0,
    100.0,0.0,
    120.0,20.0,
    120.0,40.0,
    80.0,60.0,
    60.0,40.0,
    60.0,20.0,
    80.0,0.0
    );
    hexagono.setFill(Color.ORANGE);
    hexagono.setStroke(Color.BLACK);

    //Agregar todas las formas
    HBox root = new HBox(circulo,rect,linea,figurax,hexagono);
    root.setSpacing(10);
    root.setStyle("-fx-padding: 10;"+"-fx-border-style:solid inside;"+"-fx-border-width: 2;"+"-fx-border-insets: 5;"+"-fx-border-radius: 5"+"-fx-border-color: blue;");

    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Varias formas 2D");
    stage.show();
  }
}
