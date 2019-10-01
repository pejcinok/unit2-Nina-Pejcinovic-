import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;


public class FirstFX extends Application {
    public void start (Stage stage){
      Text text= new Text(40, 40, "The Expanse of Space");



          Circle circle = new Circle();
          circle.setCenterX(100.0f);
          circle.setCenterY(100.0f);
          circle.setRadius(50.0f);
          circle.setFill(Color. LIGHTCYAN);
      Ellipse ellipse = new Ellipse();
              ellipse.setCenterX(100.0f);
              ellipse.setCenterY(100.0f);
              ellipse.setRadiusX(75.0f);
              ellipse.setRadiusY(25.0f);
              ellipse.setFill(Color.ALICEBLUE);
              ellipse.setStroke(Color.ALICEBLUE);
      Rectangle r= new Rectangle();
              r.setX(100);
              r.setY(100);
              r.setWidth(300);
              r.setHeight(200);
              r.setArcWidth(30);
              r.setArcHeight(30);
              r.setFill(Color.DARKSLATEBLUE);








      Group root = new Group(text, circle, ellipse, r);
      Scene scene = new Scene(root, 500, 400, Color.DARKBLUE);

      stage.setTitle("FirstFX");
      stage.setScene(scene);
      stage.show();
    }








public static void main(String[] args){
  launch(args);
  }
}
