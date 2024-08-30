package M01_July.ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // maximum of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        // System.out.println(Math.max(num1, num2));
        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
