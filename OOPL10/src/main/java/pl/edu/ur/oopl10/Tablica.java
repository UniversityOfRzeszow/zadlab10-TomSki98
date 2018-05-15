/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author Tomasz
 */
public class Tablica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int[] x = new int[5];
            for (int i = 0; i < 6; i++) {
                x[i] = 5;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks tablicy poza zakresem");
        }
    }

}
