package Java;

import java.util.Scanner;

public class adultandnotadult {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age>=18){
        System.out.println("This individual is an adult who is eligible to both vote and drive.");
    }
    else{
        System.out.println("This individual is not an adult and is therefore not eligible to vote or drive.");
    }
    }
}
