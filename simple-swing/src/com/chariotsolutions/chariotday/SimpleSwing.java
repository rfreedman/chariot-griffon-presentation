package com.chariotsolutions.chariotday;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class SimpleSwing extends JFrame {

    public SimpleSwing() {
        setTitle("Simple Swing Example");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Pure Java / Swing sure has a lot of ceremony!");
        label.setFont(new Font("Georgia", Font.PLAIN, 40));

        panel.add(label, BorderLayout.CENTER);
        add(panel);
        pack();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SimpleSwing frame = new SimpleSwing();
        frame.setVisible(true);
    }
    
}
