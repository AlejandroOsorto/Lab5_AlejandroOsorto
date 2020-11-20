package lab5_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Estudiante extends Personas
{
    private int numCuenta;
    private String carrera;

    public Estudiante()
    {
        super();
    }

    public Estudiante(int numCuenta, String carrera, String nombre, String apellido, int edad, char sexo)
    {
        super(nombre, apellido, edad, sexo);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public int getNumCuenta()
    {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta)
    {
        this.numCuenta = numCuenta;
    }

    public String getCarrera()
    {
        return carrera;
    }

    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
    
    
}
