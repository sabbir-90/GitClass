
package factorial_test;

import java.util.Scanner;

public class Factorial_test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        System.out.println("factorial "+n+" value "+fac(n) );
       
    }
    public static double fac(int n){
        if(n==0)
            return 1;
        
        else
        return n * fac(n-1);
    }
}
