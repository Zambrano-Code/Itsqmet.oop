
package packP;

/**
 *
 * @author Geovanny Zambrano
 */
public class Productos {

    public Productos(String Nombre, double Precio) {
        this.nombre = Nombre;
        this.precio = Precio;
    }
    
    //toString
    @Override
    public String toString(){
        String txt = "\tNombre: " + nombre + "\n\tPrecio: " + precio;
        return txt;
    }
    
    //Metodos Get y Set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    //atributos
    private String nombre;
    private double precio;
    
}
