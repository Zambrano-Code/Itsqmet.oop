
package packP;

/**
 *
 * @author Geovanny Zambrano
 */
public class NoPercedero extends Productos {
    
    public NoPercedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        
        this.tipo = tipo;
    }
    
    //toString
    @Override
    public String toString(){
        String txt;
        txt = super.toString() + "\n\tTipo: " + tipo;
        return txt;
    }
    
    //Metodos get y set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    //atributos
    
    private String tipo;
    
}
