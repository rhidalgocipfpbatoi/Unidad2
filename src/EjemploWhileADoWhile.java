/**
 * Práctica 8 de la unidad 2
 */

public class EjemploWhileADoWhile {
    private static final int LONGITUD_LINEA = -1;

    public static void main(String[] args) {

        int i = LONGITUD_LINEA;

         do {
            if (i>=0) {
                System.out.print("_");
                i--;
            }

        } while (i >= 0);

    }
}
