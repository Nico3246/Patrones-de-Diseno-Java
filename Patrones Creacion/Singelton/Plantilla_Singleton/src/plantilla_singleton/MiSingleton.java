
package plantilla_singleton;



public final class MiSingleton {
    private static final MiSingleton singleton = new MiSingleton();
    
    private static int cantidad;
    
    public MiSingleton() 
    { 
        cantidad=0;
    }
    
    public static MiSingleton obtenersingleton()
    {
        cantidad++;
        return singleton;
    }
    
    public static void vecesllamado()
    {
        System.out.println("Me has llamado " + cantidad + " veces\n");
    }
    
}
