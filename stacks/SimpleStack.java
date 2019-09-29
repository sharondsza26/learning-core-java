class SimpleStack {

    static int[] stk = new int[10];
    static int st = 10;

    public static void main(String[] args) {
        System.out.println("welcome to stack");
        print();
        push(30);
        push(20);
        push(10);
        print();
        int z = pop();
        System.out.println("Last value popped is" + z);
        print();
    }

    static void push(int v) {
        if (st == 0) {
            System.out.println("Stack Overflow");
        } else {
            st = st - 1;
            stk[st] = v;
        }
    }

    static int pop() {
        int temp = -1;
        if (st == 10) {
            System.out.println("stack Underflow");
        } else {
            temp = stk[st];
            st = st + 1;
        }
        return temp;
    }

    static void print() {

        if (st == 10) {
            System.out.println("stack underflow, no content to print");
        } else {
            for (int v : stk) {
                System.out.println(v);
            }
        }
    }
}