
package prototypefigura;

public class Circulo implements Figura {

    private int radio;
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
        radio=z;
    }

    @Override
    public String getPosicion() {
        return "El circulo se encuentra en " + coordenadaX + " y coordenada " + coordenadaY + " con radio " + radio;             
    }

    @Override
    public Figura clonar() {
        Figura f = new Circulo();
        f.setNombre(this.nombre);
        f.mover(coordenadaX, coordenadaY, radio);
        return f;
    }
    
}
