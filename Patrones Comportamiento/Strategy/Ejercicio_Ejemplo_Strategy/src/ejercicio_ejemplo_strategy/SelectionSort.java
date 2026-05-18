/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_ejemplo_strategy;

/**
 *
 * @author nicob
 */
public class SelectionSort implements SortStrategy{

    @Override
    public void sort(int[] array) {
        for(int i=0;i<array.length-1; i++)
        {
            int minIndex=i;
            for(int  j = i+1; j<array.length; j++)
            {
                if(array[j] < array[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp = array[i];
            array[i]=array[minIndex];
            array[minIndex] = temp;
        }
    }
    
}
