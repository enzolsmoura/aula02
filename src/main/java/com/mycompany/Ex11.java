package com.mycompany;

import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        String frase1, frase2, frase3, fraseFinal;
        frase1 = JOptionPane.showInputDialog("Insira uma frase (1/3):");
        frase2 = JOptionPane.showInputDialog("Insira uma frase (2/3):");
        frase3 = JOptionPane.showInputDialog("Insira uma frase (3/3):");
        fraseFinal = frase2.substring(0, frase2.length() / 2)
                + frase3.substring(frase3.length() / 2, frase3.length())
                + frase2.substring(frase2.length() / 2, frase2.length()) + frase1.substring(0, frase1.length() / 2)
                + frase3.substring(0, frase3.length() / 2) + frase1.substring(frase1.length() / 2, frase1.length());
        JOptionPane.showMessageDialog(null, String.format("%s\n%s", frase1 + frase2 + frase3, fraseFinal));
    }
}
