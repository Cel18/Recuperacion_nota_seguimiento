package uniquindio.edu.co.Ejercicio4;

import java.util.Stack;

public class Ejercicioc {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);stack.push(2);
        stack.push(3);stack.push(4);

        invertirStack(stack);
        System.out.println( stack);
    }

    public static <T extends Number> void invertirStack(Stack<T> stack) {
        if (!stack.isEmpty()) {
            T temp = stack.pop();
            invertirStack(stack);
            insertarAbajo(stack, temp);
        }
    }
    private static <T extends Number> void insertarAbajo(Stack<T> stack, T valor) {
        if (stack.isEmpty()) {
            stack.push(valor);
        } else {
            T temp = stack.pop();
            insertarAbajo(stack, valor);
            stack.push(temp);
        }
    }

    /*
    Opciones:
    a) [4, 3, 2, 1] *
	b) [1, 2, 3, 4]
	c) No compila debido a una restricción de tipo en la recursión
	d) Lanza una excepción StackOverflowError debido a una recursión infinita

    La respuesta correcta es la opción a)
    */
}
