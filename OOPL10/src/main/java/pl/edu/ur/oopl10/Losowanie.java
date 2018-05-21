/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author Tomasz
 */
public class Losowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random losuj = new Random();
        int i = 1;
        while (true) {
            int a = losuj.nextInt(11) - 10;
            int b = losuj.nextInt(21) - 10;
            try {
                int wynik = a / b;
                System.out.println(wynik);
            } catch (ArithmeticException e) {
                if (i < 3) {
                    System.out.println("Dzielenie przez zero");
                    i = i + 1;
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
