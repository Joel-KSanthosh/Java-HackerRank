package javaeof;
import java.util.Scanner;

public class JavaEOF {public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);

    int i = 1;
    while(sc.hasNext()){
        String val = sc.nextLine();
        System.out.println(i+" "+val);
        i++;
    }
}

}
