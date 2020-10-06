/**
 * Práctica 8 de la unidad 2
 */

public class EjemploWhile {
    private static final int LONGITUD_LINEA = 100;

    public static void main(String[] args) {

        int i = LONGITUD_LINEA;

        while (i >= 0) {
            System.out.print("_");
            i--;
        }

    }
}
