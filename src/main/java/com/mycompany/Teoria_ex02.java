package com.mycompany;

import javax.swing.JOptionPane;
import java.io.File;
import java.util.Scanner;

public class Teoria_ex02 {
    public static void main(String[] args) throws Exception {
        String info[] = new String[4];
        int i = 0;
        File arquivo = new File("C:\\Users\\ender\\Documents\\projects\\linguagens\\aula02\\teoria_ex02.txt");
        Scanner sc = new Scanner(arquivo);
        while (sc.hasNextLine()) {
            info[i] = sc.nextLine();
            i += 1;
        }
        sc.close();
        JOptionPane.showMessageDialog(null,
                String.format("Nome: %s\nProduto: %s\nQuantidade: %d\nPreço: R$%.2f", info[0], info[1],
                        Integer.parseInt(info[2]), Double.parseDouble(info[3])));
    }
}
