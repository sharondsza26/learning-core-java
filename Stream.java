import java.io.*;

import com.sun.corba.se.spi.orbutil.fsm.Input;

class Stream {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your name");
        String n = br.readLine();
        System.out.println("welcome" + n);
    }
}