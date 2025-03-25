package uniquindio.edu.co.Ejercicio1;

public class Producto implements Comparable<Producto>{ //implementamos comparable para el orden natural de los objetos por nombre
    private String nombre;
    private int stock;
    private double precio;

    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareTo(o.nombre); //orden natural de los nombres (orden alfabetico)
    }

    //getters, setters y toString
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + "]";
    }
}
