/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_templatemethod;

/**
 *
 * @author nicob
 */
import java.util.Scanner;
public class Ejemplo_TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio;
        double cantidad;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Indica el precio");
        precio = sc.nextDouble();
        System.out.println("Indica la cantidad");
        cantidad=sc.nextDouble();
        
        ClaseAbstractaIVA pedidoEspaña = new ClaseConcretaEspana();
        pedidoEspaña.setCantidad(cantidad);
        pedidoEspaña.setPrecio(precio);
        pedidoEspaña.calculaImporteFinal();
        
        
        ClaseAbstractaIVA pedidoAndorra = new ClaseConcretaAndorra();
        pedidoAndorra.setCantidad(cantidad);
        pedidoAndorra.setPrecio(precio);
        pedidoAndorra.calculaImporteFinal();
        
    }
    
}
