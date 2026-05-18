/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_ejemplo_strategy;

/**
 *
 * @author nicob
 */
public class SortEntidad {
    private SortStrategy strategia;

    public SortEntidad(SortStrategy strategia) {
        this.strategia = strategia;
    }

    public void setStrategia(SortStrategy strategia) {
        this.strategia = strategia;
    }
    
    public void sort(int[] array)
    {
        strategia.sort(array);
    }
}
