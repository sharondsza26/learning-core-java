public class TestingPiggyBank {



    static int balance;

    static int lt;



    public static void main(String[] args) {

        System.out.println("Welcome to Procedural PiggyBank");

        if(test1() && test2() && test3())

        {

            statement();

        }

        else

        {

            System.out.println("Program Failed");

        }

       



    }



    static void deposit(int v) {

        balance = balance + v;

        lt = v;

    }



    static void withdraw(int v) {

        if (balance >= v) {

            balance = balance - v;

            lt = -v;

        }



    }



    static void statement() {

        System.out.println("Balance = " + balance);

        System.out.println("Last Transaction = " + lt);

    }





//  TestCase 1 :: Checks the effect of the deposit as a first action on the bank and the resulting values of balance and lt. 

    

    static boolean test1() {

        deposit(50);

        return balance == 50 && lt == 50;



    }

    

//  TestCase 2 :: Checks the effect of the deposit and withdraw on the bank. The initial assumed states of balance is 50 and l      lt is 50. The final expected states of balance is 80 and lt is -10.

 

     static boolean test2() {

        deposit(40);

        withdraw(10);

        return balance == 80 && lt == -10;

    }

   

//  TestCase 3 :: Checks the effect of the deposit and withdraw on the bank with -ve values as parameters. The initial assumed states of balance is 80 and  lt is -10. The final expected states of balance is 80 and lt is -10. This is because deposit and withdraw with -ve parameters must fail silently. This means they must not be able to modify the balance and lt variables. However, this test will fail as balance and lt will be modified. To correct the situation both deposit and withdraw will have to be updated to reject -ve values as their parameters. 

 

    static boolean test3() {

        deposit(-10);

        withdraw(-30);

        return balance == 80 && lt == -10;

    }





}