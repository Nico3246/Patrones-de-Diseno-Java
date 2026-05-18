
package plantilla_abstractfactory;
import java.util.Scanner;

public class Plantilla_AbstractFactory {

    public static int nProductoB=3;
    public static int nProductoA=2;
    
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        Scanner reader2=new Scanner(System.in);//creamos 2 porque si no da fallos al leer in y string con el mismo scanner
        
        FabricaAbstracta fabrica;
        
        int eleccion;
        String modelo, estilo;
        int ano;
        double precio;
        
        ProductoAbstractoB[] productosB = new ProductoAbstractoB[nProductoB];
        ProductoAbstractoA[] productosA = new ProductoAbstractoA[nProductoA];
        
        System.out.println("Desea crear productos del tipo 1 o del tipo 2?");
        eleccion=reader.nextInt();
        
        if(eleccion==1)
            fabrica=new FabricaConcreta1();
        else
            fabrica=new FabricaConcreta2();
        
        for(int i=0; i<nProductoB; i++)
        {
            System.out.println("Producto tipo B " + i + ": ");
            System.out.println("Introduzca el modelo; ");
            
            modelo = reader2.nextLine();
            
            System.out.println("Introduce el estilo: ");
            estilo=reader2.nextLine();
            
            System.out.println("Introduce el año: ");
            ano=reader.nextInt();
            
            System.out.println("Introduce el precio: ");
            precio=reader.nextDouble();
            
            productosB[i]=fabrica.creaProductoB(modelo, estilo, ano, precio);       
         
        }
        
        for(int i=0; i<nProductoA; i++)
        {
            System.out.println("Producto tipo A " + i + ": ");
            System.out.println("Introduzca el modelo; ");
            
            modelo = reader2.nextLine();
            
            System.out.println("Introduce el estilo: ");
            estilo=reader2.nextLine();
            
            System.out.println("Introduce el año: ");
            ano=reader.nextInt();
            
            productosA[i]=fabrica.creaProductoA(modelo, estilo, ano);
         
        }

        System.out.println("Mostrar las caracteristicas");
        for(ProductoAbstractoB producB:productosB)
            producB.mostrarCaracteristicas();
        
        for(ProductoAbstractoA producA:productosA)
            producA.mostrarCaracteristicas();
    }
    
}
