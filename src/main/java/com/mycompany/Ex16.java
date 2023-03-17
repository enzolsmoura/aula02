package com.mycompany;

import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um número real (1/2):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira um número real (2/2):"));
        JOptionPane.showMessageDialog(null,
                String.format("Dividendo: %d\nDivisor: %d\nQuociente: %d\nResto: %d", a, b, a / b, a % b));
    }
}
