package functions;

public class factorial
{
  public static int multi(int a, int b)
  {
    int Product= a*b;
    return Product;
  }

  public static int factorial(int n) 
  {
   int f=1;
   for(int i=1; i<=n; i++) 
  {
    f=f*i;

  } return f;
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