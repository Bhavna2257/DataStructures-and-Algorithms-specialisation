import java.util.*;

public class DotProduct {
    private static long maxDotProduct(int n,Long[] a, Long[] b) {
        //write your code here
        long result = 0;
        long max=0;
        Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(b,Collections.reverseOrder());
       // Collections.shuffle(Arrays.asList(b));
        //System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(b));
        
        	for(int i=0;i<n;i++)
        {
        	
        	result=result+(a[i]*b[i]);
        	if(max<result)
        	max=result;
        	else
        		continue;
        }
        	
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        Long[] b = new Long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }
        System.out.println(maxDotProduct(n,a, b));
    }
}

