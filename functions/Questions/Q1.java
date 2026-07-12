package functions.Questions;
import java.util.Scanner;

public class Q1 {

  public static int avg(int a, int b, int c)
{
   int value= ((a+b+c)/3);
   return value;
}
  public static void main(String[] args) {
  
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the first Number");
     int a= sc.nextInt();
     System.out.println("Enter the Second Number");
     int b= sc.nextInt();
     System.out.println("Enter the thrid Number");
     int c= sc.nextInt();
   
      int z=avg(a,b,c);
     System.out.print("The Average of all 3 Numbers is "+z);
  
  }
}

