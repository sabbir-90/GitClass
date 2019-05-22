
package factorial_test;

import java.util.Scanner;

public class Factorial_test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int fact =1; 
	
	for(int i= num; i>=1; i--){
	fact = fact * i; 
	}
       System.out.print("Factorial of "+ num+ "="+ fact);
    }

}
