
package prototypefigura;

import java.util.Scanner;
public class PrototypeFigura {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        
        int opcion, posX=10, posY=20, tamaño=4;
        String nombre;
        
        //Figura circulo= new Circulo();
        //Figura cuadrado= new Cuadrado();
        Figura figura = null;
        Figura clon;
        Creador miFabrica = new CreadorConcreto();
        
        do{
            System.out.println("¿Que quieres crear?\n" + "1. Circulo\n"
                    + "2. Clon circulo\n" 
                    + "3. Cuadrado\n " 
                    + "4. Clon Cuadrado \n"
                    + "5. Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                case 3:
                    figura= miFabrica.factoryMethod(opcion);
                    System.out.println("Indique el nombre: ");
                    nombre = sc2.nextLine();
                    figura.setNombre(nombre);
                    figura.mover(1, 1, 1);
                    break;
                case 2:
                case 4:
                    clon= miFabrica.factoryMethod(opcion);
                    break;
            }
            if(figura != null){
                System.out.println("Soy la figura y mi nombre es " + figura.getNombre());
                System.out.println(" Y estoy en " + figura.getPosicion());
            }
            
        }while(opcion !=5);
    }
        
        /*
        circulo.setNombre("Circulo");
        circulo.mover(posX, posY, tamaño);
        
        cuadrado.setNombre("Cuadrado");
        cuadrado.mover(posX, posY, tamaño);
        
        System.out.println("¿Qué quiere usted clonar (1- Circulo o 2- Cuadrado");
        opcion= sc.nextInt();
        while(opcion<1 || opcion >2){
            System.out.println("Te has equivocado");
            opcion=sc.nextInt();
        }
        if(opcion==1)
            clon=circulo.clonar();
        else
            clon = cuadrado.clonar();
        
        if(opcion ==1)
            System.out.println("Soy el original y mi nombre es: " + circulo.getNombre() );
        else
            System.out.println("Soy el original cuadrado: " + cuadrado.getNombre());
               
        System.out.println("Soy el clon "+ clon.getNombre());
        
        System.out.println("Indique el nombre del clon");
        nombre= sc2.nextLine();
        System.out.println("Indique la coordenada x: ");
        posX = sc.nextInt();
        System.out.println("Indique la coordenada y: ");
        posY = sc.nextInt();
        System.out.println("Indique el tamaño: ");
        tamaño = sc.nextInt();
        
        clon.setNombre(nombre);
        clon.mover(posX, posY, tamaño);
        
        if(opcion ==1)
            System.out.println("Soy el original y mi nombre es: " + circulo.getNombre() );
        else
            System.out.println("Soy el original cuadrado: " + cuadrado.getNombre());
               
        System.out.println("Soy el clon "+ clon.getNombre());
        
    }*/
    
}
