import java.util.*;
public class SDPQ {
    public static void main (String[] args){
    double sum;
    double difference;
    double product;
    double quotient;
    double sumFinal;
    double differenceFinal;
    double productFinal;
    double quotientFinal;
    Scanner scanner=new Scanner(System.in);
    System.out.print("values");
    double num1=scanner.nextInt();
    double num2=scanner.nextInt();
    sum= num1+num2;
    sumFinal=(int) (sum*100)/100;
    difference=num1-num2;
    differenceFinal=(int) (difference*100)/100;
    product=num1*num2;
    productFinal=(int) (product*100)/100;
    quotient=num1/num2;
    quotientFinal=(int) (quotient*100)/100;
    System.out.println("sum: " + sum);
    System.out.println("Difference: "+ difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);







    }






}
