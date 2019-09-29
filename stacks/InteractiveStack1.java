import javax.swing.JOptionPane;

public class InteractiveStack1 {

    static int[] stk = new int[10];
    static int st = 10;

    public static void main(String[] args) {

        boolean flag = true;
        String ch = "Q";
        while (flag) {
            ch = read(" Welcome to Stack\n" + " P - Push" + "\n" + " O - Pop" + "\n" + " D - Display" + "\n"
                    + " Q - Quit" + "\n");
            switch (ch) {
            case "p":
            case "P":
                push(readValue("Enter value to be Pushed"));
                break;
            case "o":
            case "O":
                JOptionPane.showMessageDialog(null, "The last value popped is " + pop());
                break;
            case "d":
            case "D":
                print();
                break;
            case "q":
            case "Q":
                JOptionPane.showMessageDialog(null, "Thankyou for using Stack");
                flag = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong Command");

            }
        }
    }

    static String read(String s) {
        String r = JOptionPane.showInputDialog(s);
        return (r == null) ? "Q" : r;
    }

    static int readValue(String s) {
        String v1 = JOptionPane.showInputDialog(s);
        int v = 0;
        try {
            v = Integer.parseInt(v1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }
        return v;
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
            JOptionPane.showMessageDialog(null, "Stack is Empty");
        } else {
            for (int i = st; i < 10; i++) {
                str = str + stk[i] + "::";
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }

}