package pl.edu.ur.oopl10;

/**
 *
 * @author Tomasz
 */
import java.util.Scanner;

public class WprowadzZKonsoli {

    public static void main(String[] args) {
        while (true) {
            System.out.println(wprowadzint());
        }
    }

    public static int wprowadzint() {
        try {
            Scanner zad = new Scanner(System.in);
            System.out.println("Podaj liczbe calkowita: ");
            int liczba = zad.nextInt();
            return liczba;
        } catch (Exception e) {
            System.out.println("Bledna liczba ");
            int liczba = wprowadzint();
            return liczba;
        }

    }

}
