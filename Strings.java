class Strings {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "crow";
        String str3 = "cat";
        String str6 = "bat";

        if (str1 == str3) {
            System.out.println("String equal");
        } else {
            System.out.println("not equal");
        }

        String str4 = str1 + str2;
        System.out.println(str4);
        String str5 = str1 + "end";
        System.out.println(str5);
        int s6 = str6.length();
        System.out.println(s6);
        char s = str3.charAt(2);
        System.out.println(s);
        String s7 = str1.substring(1);
        System.out.println(s7);

    }
}