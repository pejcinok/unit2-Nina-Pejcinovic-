import java.util.*;
public class Average{
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);

        double average;
        System.out.println("values: ");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt() ;
        int n3= scanner.nextInt();


        average= (double) (n1+n2+n3)/3;
        System.out.print('Average" + average);


    }
}
