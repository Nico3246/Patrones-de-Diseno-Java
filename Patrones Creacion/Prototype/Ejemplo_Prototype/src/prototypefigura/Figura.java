
package prototypefigura;

public interface Figura {
    
    public void setNombre(String n);
    public String getNombre();
    public void mover(int x, int y, int z);
    public String getPosicion();
    public Figura clonar();
}
