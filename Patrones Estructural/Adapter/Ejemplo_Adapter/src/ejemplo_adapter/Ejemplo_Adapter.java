/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_adapter;
import java.util.*;
/**
 *
 * @author nicob
 */
public class Ejemplo_Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creo el servicio de pago externo");
        ServicioPagoExterno servicioE = new ServicioPagoExterno();
        
        System.out.println("Creo el adaptador");
        I_ProcesadorPago procesadorA = new AdaptadorExterno(servicioE);
        
        System.out.println("Creo el pago interno");
        Pago pago=new Pago(100, "Euros", "1111 1111 1111 1111");
        
        System.out.println("Usted va a proceder al pago de " + pago.getImporte() + " " + pago.getMoneda() + " con la tarjeta "
                + pago.getTarjeta());
        
        System.out.println("¿Son correctos estos datos? (Si/No");
        if(sc.nextLine().equalsIgnoreCase("SI"))
        {
            System.out.println("Procesamos pago externo y obtenemos resultado");
            ResultadoPago resultado = procesadorA.procesarPago(pago);
            System.out.println(resultado.mostrarResultado());
        }
        else
            System.out.println("Pago anulado");
        
    }
    
}
