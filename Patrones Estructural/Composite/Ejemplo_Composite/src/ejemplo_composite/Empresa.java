/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_composite;

/**
 *
 * @author nicob
 */
public abstract class Empresa {
    
    protected static double costeUnitarioVehiculo = 50;
    protected int n_vehiculos=0;
    
    public void agregaVehiculos()
    {
        n_vehiculos++;
    }
    
    
    public abstract double calculaCosteMantenimiento();
    public abstract boolean agregaFilial(Empresa filial);
}
