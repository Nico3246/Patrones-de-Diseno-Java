/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodecorator;

/**
 *
 * @author nicob
 */
public class DecoradorAireAcondicionado extends DecoradorCoche{

    public DecoradorAireAcondicionado(I_ConfiguradorCoche coche) {
        super(coche);
    }

    @Override
    public double getCoste() {
        return coche.getCoste() + 1200;
    }

    @Override
    public String getDescripcion() {
        return coche.getDescripcion() + "Aire acondicionado";
    }
    
}
