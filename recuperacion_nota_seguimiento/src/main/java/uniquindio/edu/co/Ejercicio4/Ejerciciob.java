package uniquindio.edu.co.Ejercicio4;

import java.util.Map;
import java.util.TreeMap;

public class Ejerciciob {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(3, "C");

        for (Integer key : treeMap.keySet()) {
            if (key == 2) {
                treeMap.put(4, "D"); 
            }
        }

        System.out.println(treeMap);
    }

    /*
    Opciones:
    a) {1=A, 2=B, 3=C, 4=D}
    b) {1=A, 3=C, 4=D}
    c) ConcurrentModificationException *
    d) No imprime nada y se bloquea

    La respuesta correcta es la opción c)
    */
}
