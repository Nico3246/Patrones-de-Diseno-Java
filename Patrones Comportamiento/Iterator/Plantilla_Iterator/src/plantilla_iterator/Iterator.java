/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package plantilla_iterator;

/**
 *
 * @author nicob
 */

//la implementan todo independientemente de como la redcorra el agregado
public interface Iterator {
    public Object siguiente();
    public Object anterior();
    public boolean tieneSiguiente();
}
