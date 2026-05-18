/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodecorator;

/**
 *
 * @author nicob
 */
public abstract class DecoradorCoche implements I_ConfiguradorCoche{
    protected I_ConfiguradorCoche coche;

    public DecoradorCoche(I_ConfiguradorCoche coche) {
        this.coche = coche;
    }

    @Override
    public abstract double getCoste();

    @Override
    public abstract String getDescripcion();
    
    
}
