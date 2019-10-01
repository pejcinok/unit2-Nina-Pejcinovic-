import java.util.*;
public class Distance_coordinates{
    public static void main (String[] Args){
        Scanner scanner=new Scanner(System.in);
        double x;
        double y;
        double x1;
        double y1;
        double xfinal;
        double yfinal;
        double xSquared;
        double ySquared;
        double xSquaredAbs;
        double ySquaredAbs;
        System.out.println("first x coordinate");
        x= scanner.nextDouble();
        System.out.println("first y coordinate");
        y=scanner.nextDouble();
        System.out.println("second x coordinate");
        x1=scanner.nextDouble();
        System.out.println("second y coordinate");
        y1=scanner.nextDouble();
        xfinal=x-x1;
        yfinal=y-y1;
        xSquared= Math.pow(xfinal,2);
        xSquaredAbs=Math.abs(xSquared);
        ySquared= Math.pow(yfinal,2);
        ySquaredAbs=Math.abs(ySquared);
        double underRadical=xSquaredAbs+ySquaredAbs;
        double distance;
        distance=Math.pow(underRadical, 0.5);
        System.out.print("Distance: " + distance);
    }
}
