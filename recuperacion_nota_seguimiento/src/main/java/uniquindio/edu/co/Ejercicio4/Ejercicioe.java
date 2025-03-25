package uniquindio.edu.co.Ejercicio4;

import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicioe {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Perro");
        set.add("Gato");
        set.add("Lobo");
        
        Iterator<String> it = set.descendingIterator();
        System.out.println(it.next());
        set.add("Tigre"); 
        System.out.println(it.next());
    }

    /*
    Opciones:
    a) "Perro Gato"
	b) ConcurrentModificationException *
	c) No imprime nada
	d) Lobo Gato

    La respuesta correcta es la opción b)
    */
}
