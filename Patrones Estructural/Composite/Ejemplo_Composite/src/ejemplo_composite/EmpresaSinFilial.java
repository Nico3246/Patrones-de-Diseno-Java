/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_composite;

/**
 *
 * @author nicob
 */
public class EmpresaSinFilial extends Empresa{

    @Override
    public double calculaCosteMantenimiento() {
        return n_vehiculos*costeUnitarioVehiculo;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return false;
    }
    
}
