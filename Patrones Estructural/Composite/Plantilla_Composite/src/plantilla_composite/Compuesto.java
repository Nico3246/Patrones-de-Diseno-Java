/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla_composite;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author nicob
 */
public class Compuesto extends Componente{
    
    protected List<Componente> elementos = new ArrayList<Componente>();

    @Override
    public void solicita() {
        for(Componente elemento:elementos)
            elemento.solicita();
    }

    @Override
    public boolean agregaHoja(Componente hoja) {
        return elementos.add(hoja);
    }

    @Override
    public boolean suprimeHoja(Componente hoja) {
        return elementos.remove(hoja);
    }
}
