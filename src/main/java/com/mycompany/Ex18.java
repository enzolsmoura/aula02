package com.mycompany;

import javax.swing.JOptionPane;

public class Ex18 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura:"));
        JOptionPane.showMessageDialog(null, String.format("Área: %f", base * altura / 2));
    }
}
