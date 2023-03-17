package com.mycompany;

import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
        JOptionPane.showMessageDialog(null, "Logaritmo de " + num + " na base 10: " + Math.log10(num));
    }
}
