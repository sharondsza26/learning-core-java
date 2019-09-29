public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome(10201));
        System.out.println(palindrome(1201));
    }

    public static int reverse(int no) {
        int reverseNo = 0;

        for (; no > 0; no /= 10) {
            reverseNo *= 10;
            reverseNo += (no % 10);
        }
        return reverseNo;
    }

    public static boolean palindrome(int no) {
        if (no == reverse(no))
            return true;
        return false;
    }
}