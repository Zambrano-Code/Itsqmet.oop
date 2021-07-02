
package packP;

import java.io.IOException;
import java.util.ArrayList;
import metodosAyuda.mhelp;

/**
 *
 * @author Asus
 */

//artibutos



public class main {
    
    private static ArrayList <Percedero> ProductoPer = new ArrayList();
    private static ArrayList <NoPercedero> ProductoNoPer = new ArrayList();

    
    public static void main(String[] args) throws IOException {
//    Perecedero ProductoP [] = new Perecedero[10];
//    NoPercedero ProductoNP [] = new NoPercedero[10];
//    List <Perecedero> Producto = new List();
        
        char opcion = 0;
        
        do {            
            opcion = menuPrincipal();
            
            switch (opcion){
                case 'a' -> agregar();
                case 'b' -> ver();
                case 'c' -> System.out.println("Saliendo....");                   
            }
            
            
        } while (opcion != 'c');
                
    }
    
    //Metodos a usar en main
    
    private static char menuPrincipal() throws IOException{
        System.out.println("\n\n------------ Menu Productos ------------");
        System.out.println(" a. Agregar producto.");
        System.out.println(" b. Ver producto.");
        System.out.println(" c. Salir.");
        System.out.println("----------------------------------------");
        char a = mhelp.solicitarOpcion("abc");
        return a;
    }

    private static void agregar() throws IOException {
        
        
        String nombre;
        double precio;
        String txt;
        int a;
        
        System.out.println("------------ Agregar Producto ----------");
        nombre = pedirNombre();
        precio = pedirPrecio();
        txt = pedirDatoTres();
        
        
        try{
            a = Integer.parseInt(txt);
            Percedero producto = new Percedero(nombre, precio, a);
            ProductoPer.add(producto); //agregar la lista
            
        }catch (NumberFormatException e){
            NoPercedero productol =  new NoPercedero(nombre, precio, txt);
            ProductoNoPer.add(productol); //agregar la lista
        }
        System.out.println("Producto agregado correctamente.");
        
    }
    
    private static void ver(){
        int a = ProductoPer.size();
        int b = ProductoNoPer.size();
        
        String txt;
        
        System.out.println("\n\n------------ Productos Percedero --------------");
        for (int i = 0; i < a; i++) {
            System.out.println("Producto: " + (i+1));
            txt = ProductoPer.get(i).toString();
            System.out.println( txt + "\n");
        }
        
        System.out.println("\n\n---------- Productos No Percedero -------------");
        for (int i = 0; i < b; i++) {
            System.out.println("Producto: " + (i+1));
            txt = ProductoNoPer.get(i).toString();
            System.out.println( txt + "\n");
        }
        System.out.println("\n\n");
        
    }
    
    //Peticiones 
    
    private static String pedirNombre() throws IOException{
        System.out.println("Ingresa el nombre del producto.");
        String txt;
        txt = mhelp.txt();
        return txt;
    }
    
    private static double pedirPrecio() throws IOException{
        System.out.println("Ingresa el precio del producto.");
        double a;
        a = mhelp.numeroDouble();
        return a;
        
    }
    
    private static String pedirDatoTres() throws IOException{
        System.out.println("Ingresa el tipo de producto o los dias faltantes a caducar.");
        String txt = mhelp.txt();
        return txt;
    }
    
    
}
