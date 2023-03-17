package com.mycompany;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio:"));
        double area = Math.PI * Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null, "Valor da área: " + area);
    }
}
