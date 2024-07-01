package javainttostring;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        try{
            String val = Integer.toString(n);
            System.out.println("Good job");

        }
        catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}
