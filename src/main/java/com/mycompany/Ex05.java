package com.mycompany;

import java.io.File;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        String palavras[] = new String[10];
        File arquivo = new File("C:\\Users\\ender\\Documents\\projects\\linguagens\\aula02\\ex05.txt");
        Scanner sc = new Scanner(arquivo);
        for (int i = 0; i < palavras.length; i++) {
            if (sc.hasNextLine()) {
                palavras[i] = sc.nextLine();
            }
        }
        sc.close();
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[palavras.length - i - 1]);
        }
    }
}
