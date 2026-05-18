
package plantilla_prototype;

public class Plantilla_Prototype {
// se puede hacer con interfaz o clase abstracta 
    public static void main(String[] args) {
        Prototipo p1= new ProtoripoConcreto1();
        Prototipo p2= new PrototipoConcreto2();
        Prototipo clonado1;
        Prototipo clonado2;
   
        clonado1= p1.clonar();
        
        System.out.println("El nombre original es ");
        System.out.println(p1.getNombre());
        System.out.println("El nombre del clon es ");
        System.out.println(clonado1.getNombre());
        
        clonado1.setNombre("Clonado 1");
        System.out.println("El nombre original es ");
        System.out.println(p1.getNombre());
        System.out.println("El nombre del clon es ");
        System.out.println(clonado1.getNombre());
    }
    
}
