package javadatatypes;
import java.util.Scanner;
import java.lang.Math;

public class JavaDataTypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T;i++){
            try{
                long n = sc.nextLong();

                if(n>=-128 && n<=127){
                    System.out.println(n+" can be fitted in:");
                    System.out.print("* byte\n* short\n* int\n* long\n");
                }
                else if(n>=-32768 && n<=32767){
                    System.out.println(n+" can be fitted in:");
                    System.out.print("* short\n* int\n* long\n");
                }
                else if(n>=Math.pow(-2,31) && n<=Math.pow(2,31)-1){
                    System.out.println(n+" can be fitted in:");
                    System.out.print("* int\n* long\n");
                }
                else if(n>=Math.pow(-2,63) && n<=Math.pow(2,63)-1){
                    System.out.println(n+" can be fitted in:");
                    System.out.print("* long\n");
                }
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
