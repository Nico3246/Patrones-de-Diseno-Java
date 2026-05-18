/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_composite;

/**
 *
 * @author nicob
 */
public class Ejemplo_Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa huelva = new EmpresaSinFilial();
        huelva.agregaVehiculos();
        Empresa sevilla = new EmpresaSinFilial();
        sevilla.agregaVehiculos();
        sevilla.agregaVehiculos();
        
        Empresa andalucia=new EmpresaMadre();
        
        andalucia.agregaFilial(huelva);
        andalucia.agregaFilial(sevilla);
        
        andalucia.agregaVehiculos();
        
        System.out.println("Coste del mantenimiento es: " + andalucia.calculaCosteMantenimiento());
    }
    
}
