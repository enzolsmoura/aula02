package com.mycompany;

import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        double base, altura;
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para a base do retângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para a altura do retângulo:"));
        JOptionPane.showMessageDialog(null,
                String.format("A área do retângulo é de %.2f unidades ao quadrado.", base * altura));
    }
}
