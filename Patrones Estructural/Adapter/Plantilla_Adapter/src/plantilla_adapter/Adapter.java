/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_adapter;

/**
 *
 * @author nicob
 */
public class Adapter {
    public void solicitudEspecifica(boolean adaptacion)
    {
        if(adaptacion)
            System.out.println("Llamada a la solicitud del adaptador");
        else
            System.out.println("No funciona en este entorno, ERROR");
    }
}
