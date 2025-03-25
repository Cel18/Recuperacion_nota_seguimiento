package uniquindio.edu.co.Ejercicio4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ejerciciod {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addFirst(5);
        deque.addLast(30);

        System.out.print(deque.pollFirst() + " ");
        System.out.print(deque.pollLast() + " ");
        System.out.print(deque.peekFirst());
    }

    /*
    Opciones:
    a) 5 30 10 *
    b) 10 30 5
    c) 5 10 20
    d) 10 20 30

    La respuesta correcta es la opción a)
    */
}
