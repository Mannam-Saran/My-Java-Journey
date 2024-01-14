package Java;

import java.util.Scanner;

public class largestoftwonumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b= sc.nextInt();
    if (a>b){
        System.out.println("A is Grater than B");
    }
    else if(a==b){
        System.out.println("A and B both are equal");
    }
    else{
        System.out.println("B is Greater than A");
    } 
    }
}
