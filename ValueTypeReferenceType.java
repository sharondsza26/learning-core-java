
import javax.swing.*;

public class ValueTypeReferenceType {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your Name");

        String title = JOptionPane.showInputDialog("Enter your title");

        JOptionPane.showMessageDialog(null, "Welcome to Java " + title + " " + name);
    }

}
