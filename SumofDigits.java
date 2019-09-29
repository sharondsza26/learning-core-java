public class SumofDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1024));
    }

    public static int sumOfDigits(int no) {
        int total = 0;
        while (no > 0) {
            total += no % 10;
            no /= 10;
        }
        return total;
    }
}