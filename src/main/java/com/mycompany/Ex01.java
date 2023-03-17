package com.mycompany;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade que voce terá neste ano: "));
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        hoje = LocalDate.of(anoAtual, 1, 1);
        int anoNascimento = anoAtual - idade;
        LocalDate nasc = LocalDate.of(anoNascimento, 1, 1);
        long diff = ChronoUnit.DAYS.between(nasc, hoje);
        JOptionPane.showMessageDialog(null, String.format("Você está vivo há %d dias", diff));
    }
}
