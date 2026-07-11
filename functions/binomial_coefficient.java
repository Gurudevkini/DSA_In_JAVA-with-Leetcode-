package functions;

public class binomial_coefficient{
 public static int fact(int n)
 {
  int f=1;
  for(int i=1; i<=n; i++)
  {
    f=f*i;
  }
 return f;
 }
 public static int bincoff(int n,int r)
 {
  int fact_n = fact(n);
  int fact_r = fact(r);
  int fact_nmr= fact(n-r);

  int bincoff = fact_n/(fact_r*fact_nmr);
  return bincoff;
 }
  public static void main(String[] args) {
     System.out.println(fact(7));
     System.out.println(bincoff(5, 2));
  }
}
