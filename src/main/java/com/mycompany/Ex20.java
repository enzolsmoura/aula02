package com.mycompany;

import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de um dos lados (1/2):"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de um dos lados (2/2):"));
        double angulo = Double
                .parseDouble(JOptionPane.showInputDialog("Insira o valor do ângulo entre os dois lados (em graus):"))
                * Math.PI / 180;
        double ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - 2 * ladoA * ladoB * Math.cos(angulo));
        JOptionPane.showMessageDialog(null, String.format("O valor do terceiro lado é de %.2f unidades.", ladoC));
    }
}
