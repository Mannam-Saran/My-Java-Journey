package Java;

import java.util.Scanner;
// sum of two numbers using user input

public class sumottwonumbersuserinput {
    public static void main(String args[]){
        Scanner var = new Scanner(System.in);
            int a = var.nextInt();
            int b = var.nextInt();
            int c = a+b;
            System.out.println("The sum of a and b is : " + c);
    }
}
