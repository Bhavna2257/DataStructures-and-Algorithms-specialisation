import java.util.*;

public class LCM {
  private static Long gcd(Long a, Long b)
  {	a=a%b;
	  if(a==0)
		  return b;
	 
	  return gcd(b,a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Long a = scanner.nextLong();
    Long b = scanner.nextLong();
    Long c=gcd(a, b);
    System.out.println((a*b)/c);
    
  }
}

