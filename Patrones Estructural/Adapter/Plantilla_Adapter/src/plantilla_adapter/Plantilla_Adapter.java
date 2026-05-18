
package plantilla_adapter;

public class Plantilla_Adapter {

    public static void main(String[] args) {
        
        Adapter adaptado = new Adapter();
        
        InterfazObjetivo adaptador=new Adaptado(adaptado);
        
        System.out.println("LLamada al adaptador");
        
        adaptador.solicita();
    }
    
}
