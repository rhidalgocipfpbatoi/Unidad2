import java.util.Scanner;

/**
 * Ejemplo para probar las instrucciones hasNext de Scanner
 */
public class EjemploHasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número ENTERO:");
        if (scanner.hasNextInt()) {
            int numeroEntero = scanner.nextInt();
        } else {
            System.out.println("No has introducido un ENTERO");
        }
    }
}
