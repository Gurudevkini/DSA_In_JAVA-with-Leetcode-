package Arrays;

import java.util.Scanner;

public class reverse {
  public static int[] reverse(int num [])
  {
    int left=0;
    int right=num.length-1;
    int temp=0; 
    while(left<right) 
    {
      temp = num[left];
      num[left]= num[right];
      num[right]= temp;
      left++;
      right--;
    }
    return num;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array");
    int a= sc.nextInt();

  int num[] = new int[a];
   
System.out.println("Enter The Elements of size :" +a);
    
    for(int i=0; i< num.length; i++)
    {
        num[i]=  sc.nextInt();
    
    }
    reverse(num);
    System.out.println("Reversed Array");
    
    for(int i=0; i< num.length; i++)
    {
       System.out.println(num[i]);
    
    }
  }
}
