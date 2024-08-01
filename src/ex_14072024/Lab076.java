package ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Shubham";
        //String s1 = "S h u b h a m";
        //          |0|1|2|3|4|5|6|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat(" Khera"); // Shubham Khera
        System.out.println(s1);

    }
}
