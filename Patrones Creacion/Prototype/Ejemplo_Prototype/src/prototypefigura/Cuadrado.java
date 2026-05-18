
package prototypefigura;


public class Cuadrado implements Figura {
    
    private int lado;
    private int coordenadaX;
    private int coordenadaY;
    private String nombre;

    @Override
    public void setNombre(String n) {
        nombre = n;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mover(int x, int y, int z) {
        coordenadaX=x;
        coordenadaY=y;
        lado=z;
    }

    @Override
    public String getPosicion() {
        return "El cuadrado se encuentra en " + coordenadaX + " y coordenada " + coordenadaY + " con lado " + lado;             
    }

    @Override
    public Figura clonar() {
        Figura f = new Cuadrado();
        f.setNombre(this.nombre);
        f.mover(coordenadaX, coordenadaY, lado);
        return f;
    }
}
