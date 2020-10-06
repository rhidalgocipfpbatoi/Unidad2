import java.util.Scanner;

/**
 * Práctica 9 de la unidad 2
 */

public class EjemploWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué longitud quieres?");

        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();

            while (i >= 0) {
                System.out.print("_");
                i--;
            }
        }

    }
}
