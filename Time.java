import java.util.*;
public class Time {
    public static void main (String[] args){
      final int SECINHOUR= 3600;
      final int SECINMIN=60;
     Scanner scanner= new Scanner(System.in);
     int timeSeconds;
     int hours=scanner.nextInt();
     int minutes=scanner.nextInt();
     int seconds=scanner.nextInt();
     timeSeconds= (hours*SECINHOUR)+(minutes*SECINMIN)+(seconds);
     System.out.print("Time in seconds: "+ timeSeconds);
    }
}
