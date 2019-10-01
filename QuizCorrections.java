import java.util.Random;
import java.util.Scanner;
public class QuizCorrections{

public static void main(String[] args){

    String firstName="Sofia";
    String middleName="Maria";
    String lastName= "Hernandez";
    String firstLetter;
    String secondLetter;
    String thirdLetter;
    String finalLetters;
      firstLetter=firstName.substring(0,1);
      secondLetter=middleName.substring(0,1);
      thirdLetter=lastName.substring(0,1);
      finalLetters=firstLetter.toLowerCase()+secondLetter.toLowerCase()+thirdLetter.toLowerCase();
  System.out.print(finalLetters);


  Scanner scan= new Scanner(System.in);
  Random rand=new Random();
  System.out.println("imput integer between 1-100");
    int userNumber;
    int genNumber;
    int diffNumber;
    int absValue;
     userNumber=scan.nextInt();
     genNumber=rand.nextInt(101)+1;
     diffNumber=userNumber-genNumber;
     absValue=Math.abs(diffNumber);
      System.out.println("Your Lucky Number:"+absValue);














  }
}
