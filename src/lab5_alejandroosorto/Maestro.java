package lab5_alejandroosorto;
import java.util.ArrayList;
/**
 *
 * @author Alejandro
 */
public class Maestro extends Personas
{
    private double salario;
    private ArrayList<Clase> listaClases;

    public Maestro()
    {
        super();
    }

    public Maestro(double salario, ArrayList<Clase> listaClases, String nombre, String apellido, int edad, char sexo)
    {
        super(nombre, apellido, edad, sexo);
        this.salario = salario;
        this.listaClases = listaClases;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public ArrayList<Clase> getListaClases()
    {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases)
    {
        this.listaClases = listaClases;
    }
    
    @Override
    public String toString()
    {
        return super.toString();
    }
}
