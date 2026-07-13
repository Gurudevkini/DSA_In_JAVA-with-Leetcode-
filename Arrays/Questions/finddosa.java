package Arrays.Questions;

import java.util.*;

public class finddosa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String array[] = { "idly", "malsa", "dosa" };
    String key;
    System.out.print("enter the key ");
    key = sc.nextLine();

    for (int i = 0; i < array.length; i++) {
      if (key.equals(array[i])) {
        System.out.println(" " + i + key + " ");

      }
    }
  }
}
