/**
 *
 */

public class EjemploWhile {
    private static final int LONGITUD_LINEA = 100;

    public static void main(String[] args) {

        int contador = LONGITUD_LINEA;

        while (contador >= 0) {
            System.out.print("_");
            contador--;
        }

    }
}
