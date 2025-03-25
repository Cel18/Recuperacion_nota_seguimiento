package uniquindio.edu.co.Ejercicio3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Posibles combinaciones de " + n + " dados: ");
        Recursivo.crearCombinacionesDados(n, new ArrayList<>());
    }
}
