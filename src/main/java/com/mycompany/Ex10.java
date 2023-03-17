package com.mycompany;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Ex10 {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Insira uma base:"));
        JOptionPane.showMessageDialog(null,
                "Logaritmo de " + num + " na base " + base + ": " + (Math.log(num) / Math.log(base)));
    }
}
