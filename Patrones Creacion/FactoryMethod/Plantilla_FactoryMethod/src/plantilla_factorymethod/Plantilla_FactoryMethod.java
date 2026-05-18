
package plantilla_factorymethod;
import java.util.Scanner;

public class Plantilla_FactoryMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo;
        Producto p;
        Creador miFabricaObjetos;
        
        System.out.println("¿Que producto deseas? (Tipo1/Tipo2)");
        tipo = sc.nextLine();
        
        /*usando fabric esto no se haria sin isarlo si se hace y nos e tienen las clases de creadorconcreto ni creador
        if(tipo.equalsIgnoreCase("Tipo1"))
            p=new ProductoConcreto1();
        else
            p=new ProductoConcreto2();
        */
       
        miFabricaObjetos=new CreadorConcreto(tipo);
        p=miFabricaObjetos.factory_Method();
        
        
        System.out.println(p.tipo_Producto());
    }
    
}


/*
//si creo un CreadorConcreto1 y CreadorConcreto2 en lugar de CreadorConcreto unicamente:
public class Plantilla_FactoryMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo;
        Producto p;
        Creador miFabricaObjetos;
        
        System.out.println("¿Que producto deseas? (Tipo1/Tipo2)");
        tipo = sc.nextLine();
        
        if(tipo.equalsIgnoreCase("Tipo 1"))
            miFabricaObjetos= new CreadorConcreto1();
        else
            miFabricaObjetos=new CreadorConcreto2();
        
        
        miFabricaObjetos=new CreadorConcreto(tipo);
        p=miFabricaObjetos.factory_Method();
        
        
        System.out.println(p.tipo_Producto());
    }
    
}
*/