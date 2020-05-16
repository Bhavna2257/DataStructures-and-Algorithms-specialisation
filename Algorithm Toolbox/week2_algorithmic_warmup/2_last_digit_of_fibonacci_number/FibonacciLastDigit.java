import java.util.*;

public class FibonacciLastDigit {
    private static long calc_fib(int n)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int sum=0;
		for(int i=2;i<=n;i++)
		{
			sum=(list.get(i-1)+list.get(i-2))%10;
			list.add(sum);
		}
		return list.get(n);
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calc_fib(n));
    }
}

