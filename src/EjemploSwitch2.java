import java.util.Scanner;

/**
 * Práctica 6 de las diapositivas de la unidad 2
 */
public class EjemploSwitch2 {
    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1:");
        int numero1 = scanner.nextInt();

        System.out.println("Numero 2:");
        int numero2 = scanner.nextInt();

        System.out.println("Operación (1:sumar, 2:restar, 3:multiplicar, 4:dividir):");
        int operacion = scanner.nextInt();

        switch (operacion) {
            case SUMA:
                System.out.println("La suma es " + (numero1 + numero2));
                break;
            case RESTA:
                System.out.println("La resta es " + (numero1 - numero2));
                break;
            case MULTIPLICACION:
                System.out.println("La multiplicación es " + (numero1 * numero2));
                break;
            case DIVISION:
                System.out.println("La división es " + (numero1 / numero2));
                break;
            default:
                System.out.println("Operación desconocida");

        }
    }
}
