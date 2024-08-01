package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        byte s1 = (byte) phone_no;
        System.out.println(s);
        System.out.println(s1);
        // JVM - GC -
    }
}
