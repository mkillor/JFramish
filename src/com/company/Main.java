package com.company;

import javax.swing.*;


import java.awt.GridLayout;


public class Main {

    public static void main(String[] args) {
        String[] items = {"One", "Two", "Three", "Four", "Five"};
        JComboBox combo = new JComboBox(items);
        JTextField field1 = new JTextField("Enter a number here");
        JTextField field2 = new JTextField("Enter another number here");
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(combo);
        panel.add(new JLabel("Field 1:"));
        panel.add(field1);
        panel.add(new JLabel("Field 2:"));
        panel.add(field2);
        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String input1 = field1.getText();
            String input2 = field2.getText();
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            Double.parseDouble(input2);
            System.out.println("the total is " + (num1 + num2));
        } else {
            System.out.println("Cancelled");
        }
    }
}


