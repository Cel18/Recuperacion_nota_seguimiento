package uniquindio.edu.co.Ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        GestorTareas<String> gestor = new GestorTareas<>();
        gestor.agregarTarea("barrer");
        gestor.agregarTarea("sacudir");
        gestor.agregarTarea("estudiar ingles");
        System.out.println("la lista esta en orden inverso.");
        gestor.mostrarLista();

        gestor.eliminarTarea("estudiar ingles");
        gestor.mostrarLista();

        System.out.println("la tarea 'barrer' se encuentra en la lista: " + gestor.buscarTarea("barrer"));
        System.out.println("la tarea 'trapear' se encuentra en la lista: " + gestor.buscarTarea("trapear"));
    }
}
