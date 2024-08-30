package M01_July.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name2 = "The Testing Academy"; // SCP

        String name3 = new String("The Testing Academy"); // Heap Ares

        System.out.println(name == name2); // check for teh reference
        System.out.println(name.equals(name2)); // check for the content
        System.out.println(name == name3);
    }
}
