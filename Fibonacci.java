public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(9);
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        System.out.print("0 1 ");
        do {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            n--;
        } while (n > 2);
    }

}