public class Secretario extends Empleado {
    protected String despacho;
    protected int numeroFax;

    public Secretario() {

    }

    public Secretario(String nombre, String apellidos, String DNI, String direccion, int telefono, double salario,
            String despacho, int numeroFax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarSalario(int cantidad) {
        this.salario = salario + 0.5 * salario;
    }

    public void imprimirDatos() {
        System.out.println("Los datos en la impresa son :" + this.despacho + this.numeroFax + "el numero de facs");
    }
}
