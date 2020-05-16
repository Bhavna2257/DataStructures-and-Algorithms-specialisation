import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FractionalKnapsack{
    private static double getOptimalValue(Double capacity, Double[] values, Double[] weights,Double[] unit) {
        double value = 0;
        double a=0;
        double scale = Math.pow(10, 4);

        
        //DecimalFormat df = new DecimalFormat("#.####");
        
    Arrays.sort(unit,Collections.reverseOrder()); 
    //System.out.println(Arrays.toString(unit));
    //System.out.println(Arrays.toString(weights));
   for(int j=0;j<values.length;j++)
   {
  outer: for(int i=0;i<values.length;i++)
       {
	   
    	   if(capacity==0)
    		   break;
    	   if(values[i]==0||weights[i]==0)
    		   continue outer;
    	   if(values[i]/weights[i]==unit[j])
    	   { 
    		   a=Math.min(weights[i], capacity);
    	    value=value+a*unit[j];;
    	   weights[i]=weights[i]-a;
    	   values[i]=values[i]-value;
    	   capacity=capacity-a;
    	   }
    	  
    	   else
    		   continue;
       }
   }
   return Math.round(value * scale) / scale;
   
    
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Double capacity = (double) scanner.nextInt();
        Double[] values = new Double[n];
        Double[] weights = new Double[n];
        Double[] unit=new Double[n];
        for (int i = 0; i < n; i++) {
            values[i] = (double) scanner.nextInt();
            weights[i] = (double) scanner.nextInt();
            unit[i]=(double) (values[i]/weights[i]);
        }
        
        
        System.out.println(getOptimalValue(capacity, values, weights,unit));
    }
} 
