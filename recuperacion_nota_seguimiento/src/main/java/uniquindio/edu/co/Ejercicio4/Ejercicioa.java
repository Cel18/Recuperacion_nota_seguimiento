package uniquindio.edu.co.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicioa {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(4, 1, 3, 2));
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }

    /*
    Opciones:
    1. [4, 3, 2, 1] *
    2. [1, 2, 3, 4]
    3. [2, 1, 3, 4]
    4. No compila

    La respuesta correcta es la opción 1
    */

}
