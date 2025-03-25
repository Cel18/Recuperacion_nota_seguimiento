package uniquindio.edu.co.Ejercicio3;

import java.util.List;

public class Recursivo {
    public static void crearCombinacionesDados (int n, List<Integer> combinaciones){
        //caso base: no hay más dados
        if (n==0) {
            System.out.println(combinaciones);
            return;
        }

        for(int i = 1; i<=6; i++){ //por cada una de las caras de un dado
            combinaciones.add(i);
            crearCombinacionesDados(n-1, combinaciones); //llama al mismo método pero con un dado menos
            combinaciones.remove(combinaciones.size()-1); //usa backtracking, ya que se devuelve (elimina el último elemento) para obtener todas las combinaciones.
        }
    }
}
