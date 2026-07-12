
package functions.Questions;
import java.util.Scanner;
public class Q2 {

  public static Boolean isEven(int num) {
    if(num%2==0)
    {
      return true;
    }

    return false;
  }
  public static void main (String [] args) 
  {
    
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the Number to check is even or not");
   int a= sc.nextInt();
   System.out.println(isEven(a));
  }
}
