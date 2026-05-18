/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_composite;
import java.util.*;
/**
 *
 * @author nicob
 */
public class EmpresaMadre extends Empresa{
    protected List<Empresa> filiales = new ArrayList<Empresa>();

    @Override
    public double calculaCosteMantenimiento() {//este seria el solicita de la plantilla
        double coste=0.0;
        for(Empresa filial:filiales)
            coste+=filial.calculaCosteMantenimiento();
        return coste + n_vehiculos * costeUnitarioVehiculo;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }
    
    
}
