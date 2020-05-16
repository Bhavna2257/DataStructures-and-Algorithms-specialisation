import java.util.*;

public class GCD {
  private static int gcd(int a, int b)
  {	a=a%b;
	  if(a==0)
		  return b;
	 
	  return gcd(b,a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd(a, b));
  }
}

