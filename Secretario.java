package AC001;

public class Secretario extends Empleado
{
    protected String despacho;
    protected int numeroFax;
    protected double salario = (1+0.05)*getAnyosAntiguedad();

    public Secretario(String despacho, int fax)
    {
        this.despacho = despacho;
        this.numeroFax = fax;
    }
    public Secretario()
    {

    }
    // ---------------------------------------------------------------------------------------------

    public void imprimir()
    {
        System.out.println("Nombre y apellidos: " + getNombre() + " " + getApellidos());
        System.out.println("DNI: " + getDNI());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Años de antiguedad: " + getAnyosAntiguedad());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Salario: " + salario);
        System.out.println("Supervisor: " + getSupervisor().getNombre());
    }
}
