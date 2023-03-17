package com.mycompany;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
        String dataStr = JOptionPane.showInputDialog("Insira uma data (ddmmaa):");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate data = LocalDate.parse(dataStr, dtf);
        JOptionPane.showMessageDialog(null,
                String.format("Dia: %s\nMês: %s\nAno: %s", data.getDayOfMonth(), data.getMonthValue(), data.getYear()));
    }
}
