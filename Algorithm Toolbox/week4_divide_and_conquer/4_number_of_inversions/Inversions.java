import java.util.*;

public class Inversions{
static long numberOfInversions = 0;
    private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
       //long numberOfInversions = 0;
        if (left>=right) {
            return numberOfInversions;
        }
        int ave = (left + right) / 2;
        numberOfInversions= getNumberOfInversions(a, b, left, ave);
        numberOfInversions = getNumberOfInversions(a, b, ave+1, right);
        numberOfInversions=merge(a,b,left,ave,right,numberOfInversions); 
        //System.out.println(Arrays.toString(a));
        return numberOfInversions;
    }
    public static long merge(int[] arr,int[] b,int left,int mid,int right,long numberOfInversions)
	{
    	
		for(int i=left;i<=right;i++)
		{
			b[i]=arr[i];
		}
		//System.out.println(Arrays.toString(b));
		int i=left;
		int j=mid+1;
		int k=left;
		for(int t=left;t<=right;t++)
		{
			
		}
		while(i<=mid&&j<=right)
		{
			if(b[i]<=b[j])
			{
				arr[k]=b[i];
				i++;
			}
			else
			{
				arr[k]=b[j];
				numberOfInversions=numberOfInversions+((mid-i)+1);
				j++;
		    }
			k++;
		}
		if(i>mid)
		{
			while(j<=right)
			{
				arr[k]=b[j];
				j++;k++;
				
			}
		}
		else
		{
			while(i<=mid)
			{
				arr[k]=b[i];
				i++;
				k++;
				//numberOfInversions++;
			}
		}
		
	return numberOfInversions;		
		
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        System.out.println(getNumberOfInversions(a, b, 0,n-1));
        
    }
}

