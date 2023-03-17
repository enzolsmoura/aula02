package com.mycompany;

import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Insira um número real (1/3):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Insira um número real (2/3):"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Insira um número real (3/3):"));
        double result = 2 * ((a - c) / 8) - b * 5;
        JOptionPane.showMessageDialog(null, result);
    }

}
