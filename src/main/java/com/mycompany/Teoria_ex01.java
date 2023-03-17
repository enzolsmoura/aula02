package com.mycompany;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class Teoria_ex01 {
    public static void main(String[] args) {
        String nome = "";
        String cod = "";
        int quant = 0;
        double preco = 0;
        nome = JOptionPane.showInputDialog("Insira o seu nome: ");
        cod = JOptionPane.showInputDialog("Insira o código do produto: ");
        quant = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade adquirida: "));
        preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço por unidade: "));
        JOptionPane.showMessageDialog(null,
                String.format("Nome: %s\nProduto: %s\nQuantidade: %d\nPreço: R$%.2f", nome, cod, quant, preco));
    }
}
