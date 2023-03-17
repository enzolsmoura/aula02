package com.mycompany;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args) {
        double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Valor inicial:"));
        double juros = Double.parseDouble(JOptionPane.showInputDialog("Valor de juros:"));
        double meses = Double.parseDouble(JOptionPane.showInputDialog("Meses:"));
        double valorFinal = valorInicial * Math.pow((1 + juros / 100), meses);
        JOptionPane.showMessageDialog(null, String.format("O valor final é de R$%.2f.", valorFinal));
    }
}
