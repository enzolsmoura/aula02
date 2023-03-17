package com.mycompany;

import java.lang.Math;

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        JOptionPane.showMessageDialog(null, Math.pow(num, 2));
    }
}
