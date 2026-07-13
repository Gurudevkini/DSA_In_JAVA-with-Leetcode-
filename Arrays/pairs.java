package Arrays;
import java.util.*;
import java.util.Scanner;
public class pairs {
  public static int[] pairs(int num[])
  {
    for(int i=0; i<num.length-1; i++)
    {
      for(int j=i+1; j<num.length; j++)
      {
        System.out.print("("+ num[i]+num[j]+")");
      }
    }
    return num;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number of Elements");
    int a= sc.nextInt();
    
     pairs(num);
    for(int i=0; i<= a.length; i++)
    {
      int num[] = next int[];
    }
    
  System.out.println();
  }
  
}
