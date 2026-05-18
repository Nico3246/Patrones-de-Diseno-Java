/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodecorator;

/**
 *
 * @author nicob
 */
public class EjemploDecorator {

    
    public static void main(String[] args) {
        I_ConfiguradorCoche miCoche = new CocheBase();
        System.out.println("Descripcion: " + miCoche.getDescripcion());
        System.out.println("Coste: " + miCoche.getCoste());
        
        miCoche = new DecoradorAireAcondicionado(miCoche);
        System.out.println("Descripcion: " + miCoche.getDescripcion());
        System.out.println("Coste: " + miCoche.getCoste());
        
        miCoche = new DecoradorNavegadorGPS(miCoche);
        System.out.println("Descripcion: " + miCoche.getDescripcion());
        System.out.println("Coste: " + miCoche.getCoste());
    }
    
}
