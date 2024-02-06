package AC001;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int anyosAntiguedad;
    private int telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnyosAntiguedad() {
        return anyosAntiguedad;
    }

    public void setAnyosAntiguedad(int anyosAntiguedad) {
        this.anyosAntiguedad = anyosAntiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", direccion='" + direccion + '\'' +
                ", anyosAntiguedad=" + anyosAntiguedad +
                ", telefono=" + telefono +
                ", salario=" + salario +
                ", supervisor=" + supervisor.nombre +
                '}';
    }

    public void cambiarSupervisor(Empleado nuevoSupervisor){
        this.supervisor = nuevoSupervisor;
    }

    public void incrementarSalario(int cantidad){
        this.salario += salario;
    }
}
