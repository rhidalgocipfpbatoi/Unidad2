import java.util.Scanner;

public class EjemploHasNextBucleWhile {
    public static void main(String[] args) {

        /*
            Partimos de la base de que Scanner trabaja con
            un sistema de buffer. Es decir, una estructura
            en forma de cola. En esta cola, se van insertando
            todos y cada uno de los caracteres que se van
            introduciendo por consola (incluídos los Enter)
         */

        Scanner scanner = new Scanner(System.in);

        /* scanner.hasNextInt();
            Si no hay datos en el buffer pausa la ejecución del programa
            para pedir que el usuario introduzca un dato; una vez el usuario
            introduce los caracteres pertinentes y pulsa Enter, todas las
            teclas pulsadas se introducirán en el buffer (en la cola).
            Una vez relleno el buffer pregunta por el tipo de dato
            de la información almacenada en el buffer y devolverá true o
            false si el dato que está introducido en el buffer es de tipo
            int (hay que tener en cuenta que esta instrucción NO EXTRAE
            la información almacenada en el buffer).

            boolean hayUnEnteroEnBuffer = scanner.hasNextInt();
        */

        /* scanner.nextInt();
            Si no hay datos en el buffer pausa la ejecución del programa
            para pedir que el usuario introduzca un dato; una vez el usuario
            introduce los caracteres pertinentes y pulsa Enter, todas las
            teclas pulsadas se introducirán en el buffer (en la cola). (En este
            caso puede ser que el buffer ya esté lleno de una hipotética llamada
            previa a hasNextInt()).
            Una vez relleno el buffer, EXTRAE la información almacenada
            en buffer en forma de entero. Por tanto del buffer se eliminará
            esa información para siempre. IMPORTANTE: nextInt, extrae sólo
            el número pero el salto de línea permanece en el buffer.

            int radio = scanner.nextInt();
         */

        /* Para poder limpiar el buffer por completo, lo más cómodo es
        tras una llamada a cualquier método nextInt hacer inmediatamente
        una llamada a nextLine.

            int radio = scanner.nextInt();
            scanner.nextLine(); // de esta manera se quita del buffer el salto
                                // de línea (o Enter)
         */

        // Os pongo un ejemplo en el que se van pidiendo números y
        // hasta que el usuario introduce el número -1

        int numeroEntero = 0;

        while (numeroEntero != -1) {

            // Paro la ejecución para pedir introducir un número entero
            System.out.println("Introduce un número entero:");
            boolean enBufferHayUnEntero = scanner.hasNextInt();

            while (enBufferHayUnEntero == false) {
                // Como no se ha metido un número entero, limpio el
                // buffer y vuelvo a pedirlo
                System.out.println("Error: no has introducido un número entero");
                scanner.nextLine();
                System.out.println("Introduce un número entero:");
                enBufferHayUnEntero = scanner.hasNextInt();
            }

            // Saco el número entero introducido en el buffer y lo
            // guardo en la variable "numeroEntero"

            numeroEntero = scanner.nextInt();
            scanner.nextLine(); // vacío el buffer (quito el Enter)
        }

    }

}
