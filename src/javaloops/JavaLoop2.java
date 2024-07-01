package javaloops;
import java.util.Scanner;
import java.lang.Math;

public class JavaLoop2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int testcaseNo = sc.nextInt();

        for(int i = 0;i < testcaseNo;i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());
            int val=a;
            for(int j = 0;j<n;j++){
                val += (int) (Math.pow(2,j)*b);
                System.out.print(val+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}
