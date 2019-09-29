public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(12));
        System.out.println(isPrime(13));
        System.out.println(isPrime(47));
    }

    public static boolean isPrime(int no) {
        if (no % 2 == 0)
            return false;
        for (int i = 3; i < no / 2; i = i + 2) {
            if (no % i == 0)
                return false;
        }
        return true;
    }
}