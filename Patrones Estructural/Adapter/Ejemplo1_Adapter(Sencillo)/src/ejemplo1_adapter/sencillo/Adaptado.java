
package ejemplo1_adapter.sencillo;


public class Adaptado {
    private String nombre;
    
    Adaptado(String n)
    {
        nombre=n;
    }
    
    
    public void setNombre(String n)
    {
        nombre=n;
    }
    
    public void mostrarNombre(String forma)
    {
        if(forma.equalsIgnoreCase("Mayuscula"))
            System.out.println("EL NOMBRE ES: " + nombre.toUpperCase());
        else
            System.out.println("el nombre es: " + nombre.toLowerCase());
    }
}
