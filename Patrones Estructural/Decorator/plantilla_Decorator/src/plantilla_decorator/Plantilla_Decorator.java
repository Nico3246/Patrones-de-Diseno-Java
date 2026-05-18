
package plantilla_decorator;

import java.util.Scanner;
public class Plantilla_Decorator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        I_ComponenteAbstracto componente = new ComponenteConcreto();//seria la clase base
        System.out.println("Componente sin decoradores");
        componente.operacion();
        System.out.println("Presion para continuar");
        sc.nextLine();
        
        componente = new DecoradorConcretoA(componente);//a la misma referencia de antes le pasa una intancia del decorador concreto A al que previamente se le pasa el componente que ya tenia.(recursividad para ir ampliando
        System.out.println("Componente con Decorador A");
        componente.operacion();
        System.out.println("Presion para continuar");
        sc.nextLine();
        
        componente = new DecoradorConcretoB(componente);//al pasarle el componente anterior se le extiende funciones al anterior
        System.out.println("Componente con Decorador B");
        componente.operacion();
        System.out.println("Presion para continuar");
        sc.nextLine();
  
    }
    
}
