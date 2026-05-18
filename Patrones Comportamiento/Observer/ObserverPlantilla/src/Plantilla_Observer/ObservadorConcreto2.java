/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla_Observer;


public class ObservadorConcreto2 implements Observador{

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Soy observador concreto2 con la accion " + accion + " en el lugar " + lugar);
    }
    
}
