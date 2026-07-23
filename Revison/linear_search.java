package Revison;

import java.util.Scanner;

public class linear_search {

  public static int linear(int num[], int key) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == key) {
        System.out.println("KEY IS FOUND");
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] agrs) {
    int num[] = { 1, 2, 5, 7, 78, 98 };
    int key = 8;
    System.out.println(linear(num, key));

  }

}

// public class linear_search {

// public static void main(String[]args)
// {
// Scanner s = new Scanner(System.in);
// int key,i=0;
// System.out.println("Enter the number of elements");
// int n = s.nextInt();
// int[] a = new int[n];
// System.out.println("Enter the array elements ");
// for(i=0;i<n;i++)
// a[i]= s.nextInt();
// System.out.println("Enter a key element ");
// key = s.nextInt();
// boolean found = false;
// for(i=0;i<n;i++)
// {
// if(a[i]==key){
// System.out.println("Element founda at position "+i);
// found=true;
// break;
// }
// }
// if(!found)
// {
// System.out.println("Element not found");
// }
// }
// }
//