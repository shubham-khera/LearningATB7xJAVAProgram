package M01_July.ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check if  number id even or odd
        // Logic Building
        // 1. Figure out the inputs
            // Data type - int
            // How to take input in java? - Scanner - class-
            //nextInt() -> input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        // 2. Data type
        if(user_input%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // 3. Do we need to conversion or directly
        // 4. Rough logic
        // 5. Optimize

    }
}
