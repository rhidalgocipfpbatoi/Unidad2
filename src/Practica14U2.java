/* Práctica 14 - Unidad 2
*  Ejemplo con do-while
*/
import java.util.Scanner;

public class Practica14U2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Dime un número:");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();

                if (numero < 0 || numero > 10) {
                    System.out.println("El número no está entre 0 y 10");
                }
            } else {
                System.out.println("No has introducido un entero");
                numero = -1;
            }

            scanner.nextLine();

        } while(numero < 0 || numero > 10);
    }
}
