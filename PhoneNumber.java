import java.util.*;
import java.text.*;
public class PhoneNumber{
  public static void main (String[] args){
    DecimalFormat fmt=new DecimalFormat("00");
    //area code

    int firstAC;
    int secondAC;
    int restOfAC;
      //the first digit cannot start with a zero or a one [2,9]
      firstAC=(int)(Math.random()*8)+ 2;
      //and the second digit cannot be a 9 [0,8]
      secondAC=(int)(Math.random()*9);
      //[0,9]
      restOfAC=(int)(Math.random()*10);

    //exchange code


    int firstNumberEC;
    int restOfEC;
      //[2,9]
      firstNumberEC=(int)(Math.random()*8)+2;
      //[0,99];
      restOfEC=(int)(Math.random()*100);



    //last 4 numbers


    int lastFourNumbers;
      //[0,9999]
      lastFourNumbers=(int)(Math.random()*10000);

    System.out.print("("+firstAC+secondAC+restOfAC+")");
    System.out.print(firstNumberEC+fmt.format(restOfEC)+"-" + fmt.format(lastFourNumbers));

  }
}
