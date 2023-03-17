package com.mycompany;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Ex08 {
    public static void main(String[] args) {
        double ang = Double.parseDouble(JOptionPane.showInputDialog("Insira um ângulo em graus:"))*Math.PI/180;
        JOptionPane.showMessageDialog(null,
                String.format("Seno: %f\nCosseno: %f\nSecante: %f\nCossecante: %f\nTangente: %f\nCotangente:%f",
                        Math.sin(ang), Math.cos(ang), 1 / Math.cos(ang), 1 / Math.sin(ang), Math.tan(ang),
                        1 / Math.tan(ang)));
    }
}
