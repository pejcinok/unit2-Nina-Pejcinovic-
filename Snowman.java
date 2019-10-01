import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;

public class Snowman extends Application {
    public void start (Stage stage){

      final double CENTERLINE=200;
      final double EYELINE=160;
      final double ARMLINE=250;






      Circle circle = new Circle();
      circle.setCenterX(CENTERLINE);
      circle.setCenterY(175);
      circle.setRadius(50.0f);
      circle.setFill(Color. WHITE);

      Circle circle2 = new Circle ();
        circle2.setCenterX(CENTERLINE);
        circle2.setCenterY(ARMLINE);
        circle2.setRadius(60.0f);
        circle2.setFill(Color. WHITE);

        Circle circle3 = new Circle ();
           circle3.setCenterX(CENTERLINE);
           circle3.setCenterY(325.0f);
           circle3.setRadius(70.0f);
           circle3.setFill(Color. WHITE);

        Rectangle r= new Rectangle();
                r.setX(0);
                r.setY(400);
                r.setWidth(500);
                r.setHeight(100);
                r.setArcWidth(0);
                r.setArcHeight(0);
                r.setFill(Color.WHITE);









// extra stuff


              Circle eye1 = new Circle();
                eye1.setCenterX(180.0f);
                eye1.setCenterY(EYELINE);
                eye1.setRadius(5.0f);
                eye1.setFill(Color.BLACK);

              Circle eye2 = new Circle();
                eye2.setCenterX(220.0f);
                eye2.setCenterY(EYELINE);
                eye2.setRadius(5.0f);
                eye2.setFill(Color.BLACK);

              Polygon nose = new Polygon();
                nose.getPoints().addAll(new Double[]{
                  205.0, 180.0,
                  195.0, 180.0,
                  200.0, 185.0 });
                  nose.setFill(Color.ORANGE);

              Rectangle arm1= new Rectangle();
                    r.setX(0);
                    r.setY(ARMLINE);
                    r.setWidth(10);
                    r.setHeight(10);
                    r.setArcWidth(30);
                    r.setArcHeight(30);
                    r.setFill(Color.BROWN);

                  Rectangle arm2= new Rectangle();
                          r.setX(250);
                          r.setY(ARMLINE);
                          r.setWidth(100);
                          r.setHeight(10);
                          r.setArcWidth(30);
                          r.setArcHeight(30);
                          r.setFill(Color.BROWN);
                  Rectangle tophat= new Rectangle();
                          tophat.setX(150);
                          tophat.setY(130);
                          tophat.setWidth(100);
                          tophat.setHeight(10);
                          tophat.setArcWidth(30);
                          tophat.setArcHeight(30);
                          tophat.setFill(Color.BLACK);
                    Rectangle tophat1= new Rectangle();
                            tophat1.setX(155);
                            tophat1.setY(80);
                            tophat1.setWidth(85);
                            tophat1.setHeight(50);
                            tophat1.setArcWidth(10);
                            tophat1.setArcHeight(10);
                            tophat1.setFill(Color.BLACK);




    Group basic = new Group(circle, circle2, circle3, r, nose);
    Group extra = new Group(eye1, eye2, arm1, arm2, tophat, tophat1);
    Group root= new Group(basic, extra);
    Scene scene = new Scene(root, 500, 400, Color.DARKBLUE);

    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();
  }








public static void main(String[] args){
launch(args);
  }
}
