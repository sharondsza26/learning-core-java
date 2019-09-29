public class LogBase {

    public static void main(String[] args) {
        System.out.println(logBase2(2));
        System.out.println(logBase2(32));
        System.out.println(logBase2(2048));
        System.out.println(logBase2(131072));
    }

    public static int logBase2(int no) {
        int power = 0;
        for (; no > 1; no /= 2)
            power++;
        return power;
    }
}