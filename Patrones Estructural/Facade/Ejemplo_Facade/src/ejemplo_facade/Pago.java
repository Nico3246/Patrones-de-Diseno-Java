
package ejemplo_facade;


public class Pago {
    public boolean procesarPago(double cantidad){
        System.out.println("Procesando pago" + cantidad + " euros");
        System.out.println("Simulamos se ppuede pagar");
        return true;
    }
    
    
}
