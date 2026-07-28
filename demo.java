public class demo {
    public static void main(String[] args) {
        int age = 20;
        if (age < 18) {
            throw new ArithmeticException("not eligible to vote");
        }
        System.out.println("eligible to vote");
    }
}
