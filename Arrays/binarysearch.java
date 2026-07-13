package Arrays;

import java.util.*;

public class binarysearch 
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    int[] array = {1,2,3,4,5};
    System.out.println("Enter a key element");
    int key = s.nextInt();
    int start=0,end=array.length-1,mid;
    while(start<=end)
    {
    mid = (start+end)/2;
    if(array[mid]==key){ 
      System.out.println("Element found at position "+mid);
    return;
    }else if(array[mid]<key)
      start=mid+1;
    else end = mid-1;
    }
  }
}