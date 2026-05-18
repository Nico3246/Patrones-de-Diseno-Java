
package plantilla_iterator;


public class Plantilla_Iterator {

    public static void main(String[] args) {
        Agregado ln = new AgregadoConcreto();
        I_ListaPalabras lp = new ListaPalabras();
        
        
        System.out.println("Introduzco los numeros");
        ln.agregar(5);
        ln.agregar(1);
        ln.agregar(4);
        ln.agregar(68);
        ln.agregar(2);
        ln.agregar(0);
        ln.agregar(25);

        
        Iterator iterador = ln.CrearIterador();
        System.out.println("Vamos a sacar como una cola");
        while(iterador.tieneSiguiente())
            System.out.println(iterador.siguiente());
        
        
        Iterator iterador2 = ln.CrearIterador2();
        System.out.println("Vamos a sacar como una pila");
        while(iterador2.tieneSiguiente())
            System.out.println(iterador2.siguiente());
        
        
        
        lp.agregar("cinco");
        lp.agregar("uno");
        lp.agregar("cuatro");
        lp.agregar("sesenta y ocho");
        lp.agregar("dos");
        lp.agregar("cero");
        lp.agregar("venticuatro");
        
        Iterator iterador3 =lp.CrearIterador();
        System.out.println("Vamos a sacar las palabras como una cola");
        while(iterador3.tieneSiguiente())
            System.out.println(iterador3.siguiente());
        

    }
    
}
