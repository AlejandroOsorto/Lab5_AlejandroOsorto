package lab5_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Estudiante extends Personas
{
    private int numCuenta;
    private Carrera carrera;

    public Estudiante()
    {
        super();
    }

    public Estudiante(int numCuenta, Carrera carrera, String nombre, String apellido, int edad, char sexo)
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

    public Carrera getCarrera()
    {
        return carrera;
    }

    public void setCarrera(Carrera carrera)
    {
        this.carrera = carrera;
    }
    
    
}
