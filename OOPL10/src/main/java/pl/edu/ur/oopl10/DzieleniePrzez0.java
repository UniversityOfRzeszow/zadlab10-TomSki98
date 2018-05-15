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
public class DzieleniePrzez0 extends Exception {

    public int dzielenie(int a, int b) {
        try {
            int x = a / b;
        } catch (Exception e) {
            System.out.println("!!! DZIELENIE PRZEZ ZERO !!!");
            return 0;
        }
        return a / b;
    }
}
