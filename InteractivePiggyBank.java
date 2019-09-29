public class InteractivePiggyBank {



    static int balance;

    static int lt;



    public static void main(String[] args) {

        boolean flag = true;

        String ch = "Q";

        while (flag) {

            ch = read(" Welcome to PiggyBank\n"

                    + " D - Deposit" + "\n"

                    + " W - Withdraw" + "\n"

                    + " S - Statement" + "\n"

                    + " Q - Quit" + "\n"

            );

            switch (ch) {

                case "d":

                case "D":deposit(

                           readValue("Enter Amount to be Deposited")

                         );

                         break;

                case "w":

                case "W":withdraw(

                           readValue("Enter Amount to be Withdrawn")

                         );

                         break;

                case "s":

                case "S":

                    statement();

                    break;

                case "q":

                case "Q":

                    JOptionPane.showMessageDialog(null,

                                   "Thankyou for using PiggyBank");

                    flag = false;

                    break;

                default:JOptionPane.showMessageDialog(null,

                                   "Wrong Command");



            }

        }

    }



    static String read(String s) {

        String r = JOptionPane.showInputDialog(s);

        return (r == null) ? "Q" : r;

    }



    static int readValue(String s) {

        String v1 = JOptionPane

                .showInputDialog(s);

        int v = 0;

        try {

            v = Integer.parseInt(v1);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,

                              "Invalid Input");

        }

        return v;

    }



    static void deposit(int v) {

        balance = balance + v;

        lt = v;

    }



    static void withdraw(int v) {

        if (balance >= v) {

            balance = balance - v;

            lt = -v;

        } else {

            JOptionPane.showMessageDialog(null, 

                    "Cannot Withdraw more than the Balance");

        }



    }



    static void statement() {

        JOptionPane.showMessageDialog(null,

                       "Balance = " + balance

                       + "\n" + "Last Transaction = " + lt);

    }

}