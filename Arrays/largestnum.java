package Arrays;

import java.util.*;

public class largestnum
{
   public static int getlarge(int numbers[])
   {
     int largest = Integer.MIN_VALUE;

     for(int i=0; i<numbers.length; i++)
     {
      if(largest < numbers[i])
      {
        largest = numbers[i];
      }
     }
    return largest;
   }

  public static void main(String[] args) {
    
 int numbers[] = { 1, 2, 16, 3, 5 };

System.out.print("The Largest Number " +getlarge(numbers));
  }
}



















// public class largestnum {

//   public static int largest(int[] numbers) {
//     int first = Integer.MIN_VALUE;
//     for (int i = 0; i < numbers.length; i++) {

//       while (numbers[i] > first) {
//         first = numbers[i];
//       }
//     }
//     return first;
//   }

//   public static void main(String[] agrs) {
   
//     int numbers[] = { 1, 2, 16, 3, 5 };

//     System.out.print("The Largest Number " +largest(numbers));
   
//   }
// }
