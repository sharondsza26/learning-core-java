public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(1024));
    }

    public static int reverse(int no) {
        int reverseNo = 0;

        for (; no > 0; no /= 10) {
            reverseNo *= 10;
            reverseNo += (no % 10);
        }
        return reverseNo;
    }
}