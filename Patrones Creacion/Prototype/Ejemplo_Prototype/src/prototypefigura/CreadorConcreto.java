
package prototypefigura;


public class CreadorConcreto extends Creador{
    
    private int tipo;
    private Figura f;
    private boolean circulo, cuadrado;

    public CreadorConcreto() {
        circulo = false;
        cuadrado = false;
        f = null;
    }
    
    @Override
    public Figura factoryMethod(int t){
        tipo = t;
        if(tipo == 1){
            f= new Circulo();
            circulo = true;
            return f;
        }else if( tipo == 2 && circulo == true ){
            return f.clonar();
        }else if( tipo == 3 ){
            f= new Cuadrado();
            cuadrado = true;
            return f;
        }else if(tipo == 4 && cuadrado == true ){
            return f.clonar();
        }else{
            System.out.println("No se ha podido crear");
            return null;
        }
        
    }
}
