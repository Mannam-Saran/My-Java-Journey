/*
 if income< 5L--> 0% tax
 if income between 5-10L --> 20% tax
 if income > 10L--> 30% tax
 */

package Java;

import java.util.Scanner;

public class Incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income< 500000){
            tax = 0;
        }
        else if(income>= 500000 && income < 1000000 ){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }
        System.out.println("The Total Tax Paid " + tax);
    }
    
}
