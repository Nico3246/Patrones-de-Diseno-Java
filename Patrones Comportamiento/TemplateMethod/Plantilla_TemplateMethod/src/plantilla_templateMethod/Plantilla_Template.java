/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plantilla_templateMethod;

/**
 *
 * @author nicob
 */
public class Plantilla_Template {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseAbstracta concreta1 = new ClaseConcreta1();
        
        concreta1.templateMethod();//al ejecutar relaiza las de la clase concreta 1
        
        ClaseAbstracta concreta2 = new ClaseConcreta2();
        
        concreta2.templateMethod();//ahora realiza la parte de la clase 2
        
        
    }
    
}
