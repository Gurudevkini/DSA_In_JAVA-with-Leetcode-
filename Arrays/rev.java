package Arrays;
import java.util.*;
public class rev {
   public static void reverse(int num[])
   {
   int left=0;
   int right= num.length -1;
   int temp=0;
   while (left < right)
   {
      temp= num[left];
      num[left]= num[right];
     num[right]= temp;
     left++;
     right--;
   }
  }
    public static void main(String[] args) {
       int num[]= {2,4,6,8,10};
       reverse(num);  // FIRST FUNCTION CALLL THAN
       for(int i=0; i<num.length; i++)
       {
        System.out.println(num[i]+ "");
       }

   System.out.println();
   
    }
}

