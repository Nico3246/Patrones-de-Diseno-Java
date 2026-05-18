/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodecorator;

/**
 *
 * @author nicob
 */
public class CocheBase implements I_ConfiguradorCoche{

    @Override
    public String getDescripcion() {
        return "Coche Basico";
    }

    @Override
    public double getCoste() {
        return 15000;
    }
    
}
