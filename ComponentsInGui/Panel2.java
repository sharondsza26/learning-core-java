package ComponentsInGui;

import javax.swing.*;
import java.awt.*;

public class Panel2 {
    
    public static void main(String[] args) {
        Panel2 gui = new Panel2();
        gui.go();
    }

    //Using Box Layout to stack buttons
    
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton button2 = new JButton("bliss");

        panel.add(button);
        panel.add(button2);
        
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}