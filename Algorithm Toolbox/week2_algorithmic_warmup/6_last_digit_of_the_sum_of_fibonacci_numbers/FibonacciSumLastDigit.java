import java.util.*;

public class FibonacciSumLastDigit {
    private static long calc_fib(long n)
	{
    	ArrayList<Long> list=new ArrayList<Long>();
    	list.add(0l);
		list.add(1l);
	long current;
		long prev2=0;
		long prev1=1;
		long r=0;
		int i=2;
		while(true) {
			
			current=(prev1+prev2)%10;
			list.add(current%10);
			if(list.get(i)==1&&list.get(i-1)==0)
			{
				break;
			}
		prev2=prev1;
		prev1=current;
		i++;
}
		
	if(n>60)
n=n%60;
	
	for(i=0;i<=n;i++)
	{
		r=(r+list.get(i))%10;
	}
	return r;}
	
public static void main(String[] args)
	{
		  Scanner var = new Scanner(System.in);
		    long n = var.nextLong();
		    System.out.println(calc_fib(n));
		    
	}

}
