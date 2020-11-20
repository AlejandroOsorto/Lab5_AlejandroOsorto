package lab5_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Clase
{
    private String nombre;
    private int seccion;
    private String edificio;
    private String salon;
    private String aire;

    public Clase()
    {
    }

    public Clase(String nombre, int seccion, String edificio, String salon, String aire)
    {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aire = aire;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getSeccion()
    {
        return seccion;
    }

    public void setSeccion(int seccion)
    {
        this.seccion = seccion;
    }

    public String getEdificio()
    {
        return edificio;
    }

    public void setEdificio(String edificio)
    {
        this.edificio = edificio;
    }

    public String getSalon()
    {
        return salon;
    }

    public void setSalon(String salon)
    {
        this.salon = salon;
    }

    public String isAire()
    {
        return aire;
    }

    public void setAire(String aire)
    {
        this.aire = aire;
    }

    @Override
    public String toString()
    {
        return nombre + "; " + seccion + "; " + edificio + "; " + salon + "; " + aire;
    }
    
    
}
