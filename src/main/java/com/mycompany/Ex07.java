package com.mycompany;

import javax.swing.JOptionPane;

public class Ex07 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:"));
        String strNum = Integer.toString(num);
        JOptionPane.showMessageDialog(null, String.format("Dezena: %s",strNum.charAt(strNum.length()-2)));
    }
}