package com.mycompany;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String inputs[] = new String[3];
        int comp = 0;
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = JOptionPane.showInputDialog("Insira um texto:");
        }

        for (int i = 0; i < inputs.length; i++) {
            comp += inputs[i].length();
        }
        JOptionPane.showMessageDialog(null, String.format("O tamanho total dos textos é de %d caracteres.", comp));
    }
}
