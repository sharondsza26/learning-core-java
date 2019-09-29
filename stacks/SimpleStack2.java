
import javax.swing.JOptionPane;

public class SimpleStack2 {

    static int[] stk = new int[10];
    static int st = 10;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Stack");
        print();
        push(10);
        push(20);
        push(30);
        print();
        int z = pop();
        print();
        JOptionPane.showMessageDialog(null, "Last value Popped is " + z);
    }

    static void push(int v) {
        if (st == 0) {
            JOptionPane.showConfirmDialog(null, "Stack Overflow");
        } else {
            st = st - 1;
            stk[st] = v;
        }
    }

    static int pop() {
        int temp = -1;
        if (st == 10) {
            JOptionPane.showConfirmDialog(null, "Stack Underflow");
        } else {
            temp = stk[st];
            st = st + 1;
        }
        return temp;
    }

    static void print() {
        String str = "";
        if (st == 10) {
            JOptionPane.showMessageDialog(null, "Stack is Empty, No content to display");
        } else {
            for (int i = st; i < 10; i++) {
                str = str + stk[i] + "::";
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }

}