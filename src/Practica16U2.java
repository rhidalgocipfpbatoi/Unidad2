import java.util.Scanner;

public class Practica16U2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el número:");
        int numero = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(numero + "X" + (i+1) + " = " + (numero*(i+1)));
        }
    }
}
