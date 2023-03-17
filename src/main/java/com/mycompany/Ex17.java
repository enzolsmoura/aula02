package com.mycompany;

import javax.swing.JOptionPane;

public class Ex17 {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
        JOptionPane.showMessageDialog(null,
                String.format("Número: %f\nQuadrado: %f\nRaiz: %f", x, x * x, Math.sqrt(x)));

    }
}
