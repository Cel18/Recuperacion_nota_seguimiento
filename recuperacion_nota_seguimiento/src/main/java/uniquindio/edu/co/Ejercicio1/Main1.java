package uniquindio.edu.co.Ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();
        Producto producto1 = new Producto("chocolate", 10, 5000);
        Producto producto2 = new Producto("mango", 7, 15000);
        Producto producto3 = new Producto("escoba", 20, 2500);
        almacen.agregarProducto(producto1);
        almacen.agregarProducto(producto2);
        almacen.agregarProducto(producto3);
        almacen.mostrarLista();

        almacen.ordenarMenorPrecio();
        System.out.println("Ordenadas de menor a mayor precio: ");
        almacen.mostrarLista();
    }
}
