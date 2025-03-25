package uniquindio.edu.co.Ejercicio2;

import java.util.Iterator;
import java.util.LinkedList;

public class GestorTareas<T> implements Iterable<T>{
    private LinkedList<T> tareas;

    public GestorTareas() {
        this.tareas = new LinkedList<>();
    }

    public void agregarTarea(T tarea){
        tareas.add(tarea); //podríamos usar addFirst para que las tareas se agreguen al inicio de la lista, para que la tarea más reciente se encuentre primero
    }

    public void eliminarTarea(T tarea){
        tareas.remove(tarea);
    }

    public boolean buscarTarea(T tarea){
        return tareas.contains(tarea);
    }

    public void mostrarLista(){
        System.out.println("Lista de tareas:");
        Iterator<T> it = iterator(); //Usamos el iterador
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
    }

    @Override
    public Iterator<T> iterator() {
        return tareas.descendingIterator(); //recorrer lista de la más reciente a más antigua
    }
    
}
