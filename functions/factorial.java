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
   System.out.println(factorial(7));
  }
}