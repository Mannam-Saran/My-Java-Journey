package Java;

import java.util.Scanner;

public class StudentPassorFail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String ReportCard = marks>33? "Pass": "Fail";
        System.out.println(ReportCard);
    }
}