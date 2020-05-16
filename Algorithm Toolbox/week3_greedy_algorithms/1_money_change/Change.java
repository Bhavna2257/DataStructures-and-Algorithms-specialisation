import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
      int[] a={10,5,1};
      int sum=0;
      for(int i=0;i<3;i++)
      {
      int r=m/a[i];
      m=m%a[i];
      sum=sum+r;
    }
      return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

