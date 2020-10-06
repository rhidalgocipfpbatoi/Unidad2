import java.util.Scanner;

/**
 * Ejemplo para ver la estructura switch
 */
public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                numero = numero + 3;
                break;
            case 2:
                numero = numero - 1;
                break;
            default:
                numero = numero * 1000;
        }

        System.out.println(numero);

    }
}
