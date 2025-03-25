package uniquindio.edu.co.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Almacen <T extends Producto> implements Iterable<T> { //en este caso usamos T extends Producto para que T solo pueda ser subclase de Producto y tenga sus métodos 
    private ArrayList<T> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return productos.iterator();
    }
    
    public void agregarProducto (T producto) {
        productos.add(producto);
        Collections.sort(productos); //se utiliza para ordenar los productos (en este caso en base al comparador que es en orden alfabetico)
    }

    public void ordenarMenorPrecio () {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio)); //se utiliza un sort y comparator que compara los precios
    }

    public void mostrarLista () {
        Iterator<T> it = iterator(); //Usamos el iterador
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
    }
}
