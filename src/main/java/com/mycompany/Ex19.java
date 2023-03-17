package com.mycompany;

import javax.swing.JOptionPane;

public class Ex19 {
    public static void main(String[] args) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado do losango:"));
        double angulo = Double
                .parseDouble(JOptionPane.showInputDialog("Insira o valor do ângulo maior do losango (em graus):"))
                * Math.PI / 180;
        double area = (2 * lado * Math.sin(angulo / 2) * 2 * lado * Math.cos(angulo / 2)) / 2;
        JOptionPane.showMessageDialog(null, String.format("O valor da área é de %.2f unidades ao quadrado.", area));
    }
}
