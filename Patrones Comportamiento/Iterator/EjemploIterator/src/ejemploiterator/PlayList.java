
package ejemploiterator;

//lista de canciones

import java.util.ArrayList;

public class PlayList {
    private ArrayList<Cancion> canciones = new ArrayList<>();
    
    public void agregarCancion(Cancion c)
    {
        canciones.add(c);
    }
    
    
    public ArrayList<Cancion> getCanciones()
    {
        return canciones;
    }
    
    
    public Iterador crearIterador()
    {
        return new PlaylistIterador(canciones);
    }
    
    public Iterador crearIteradorAleatorio()
    {
        return new PlaylistIteradorAleatorio(canciones);
    }
    
}
