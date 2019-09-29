
class Point {
    int x = 5;
    int y = 5;

    static {
        System.out.println("static block");
    }
    {
        System.out.println("inst block");
    }
}

class c1 {
    public static void main(String[] args) {
        Point v1 = new Point();
        Point v2 = new Point();
        // v1.print();
        // v2.print();
        System.out.println("x=" + v1.x);
        System.out.println("y=" + v2.y);

    }
}
