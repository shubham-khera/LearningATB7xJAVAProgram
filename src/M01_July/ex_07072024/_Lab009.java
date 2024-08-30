package M01_July.ex_07072024;

import java.util.Scanner;

public class _Lab009 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = inputObj.nextInt();
        if (n %2==0){
        System.out.println("The value of n is even");}
        else {
            System.out.println("The value of n is odd");
        }
    }
}
