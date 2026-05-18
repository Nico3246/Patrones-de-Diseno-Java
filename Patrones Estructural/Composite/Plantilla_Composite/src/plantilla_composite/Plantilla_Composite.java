
package plantilla_composite;


public class Plantilla_Composite {

 //este seria el cliente
    public static void main(String[] args) {
        Componente componente1=new Hoja("hoja 1");
       // System.out.println("Solicitamos operacion de hoja");
       // componente1.solicita();
        
        Componente componente2=new Hoja("hoja 2");
       // System.out.println("Solicitamos operacion de hoja");
       // componente2.solicita();
        
        
        Componente grupo = new Compuesto();
        
        grupo.agregaHoja(componente1);
        grupo.agregaHoja(componente2);
        System.out.println("Operacion en grupo");
        //grupo.solicita();
        
        Componente grupo2 = new Compuesto();
        Componente compuesto2=new Hoja("Hoja 3");
        Componente compuesto3=new Hoja("Hoja 4");
        
        
        grupo2.agregaHoja(compuesto2);
        grupo2.agregaHoja(compuesto3);
        grupo2.agregaHoja(grupo);
        grupo2.solicita();

    }
    
}
