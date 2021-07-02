
package packP;

/**
 *
 * @author Geovanny Zambrano
 */
public class Percedero extends Productos{
    
    public Percedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        
        this.diasACaducar = diasACaducar;
    }
    
    //Metodos de Trabajo
    
    private boolean aplicarDescuento(){
        double Precio = super.getPrecio();
        int porcentaje = 0;
        
        switch (diasACaducar){
            case 1:
                porcentaje = 40;
                break;
            case 2:
                porcentaje = 30;
                break;
            case 3:
                porcentaje = 20;
                break;            
        }
        if (porcentaje != 0) {            
            Precio = Precio*((100-porcentaje)/100);
            super.setPrecio(Precio);
            return true;
        }else {
            return false;
        }
        
    }
    
    
    //toString
    @Override
    public String toString(){
        String txt;
        txt = super.toString() + "\n\tDias a Caducar: " + diasACaducar;
        return txt;
    }
    
    //metodos get y set

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }
    
    //atributos
    private int diasACaducar;
    
}
