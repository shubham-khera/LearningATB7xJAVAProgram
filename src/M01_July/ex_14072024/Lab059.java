package M01_July.ex_14072024;

public class Lab059 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        int total_price = course + (int)GST;
        float total_price_f = course + GST;
        System.out.println(total_price);
        System.out.println(total_price_f);
    }
}
