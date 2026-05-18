
package plantilla_singleton;


public class Plantilla_Singleton {

    public static void main(String[] args) {
        
        MiSingleton s1= MiSingleton.obtenersingleton();
        MiSingleton s2= MiSingleton.obtenersingleton();
        MiSingleton s3= MiSingleton.obtenersingleton();
        MiSingleton s4= MiSingleton.obtenersingleton();
        MiSingleton s5= MiSingleton.obtenersingleton();
        
        s3.vecesllamado();//independientemente del numero de veces q obtenga el singleton, independiente de cual trabaje siempre dira q lo he llamado 5 veces (eso demuestra que es una instancia unica)
        
    }
    
}
