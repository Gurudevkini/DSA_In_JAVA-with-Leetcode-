package functions;

public class multiply
{
  public static int multi(int a, int b)
  {
    int Product= a*b;
    return Product;
  }
  public static void main(String[] args) {
    int a=3;
    int b=5;
    int prod = multi(a,b);
    System.out.println("a*b ="+prod);
   int abc= multi(10, 10);
   System.out.println("a*b=" +prod);
  }
}