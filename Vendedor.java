package colaborativeT7;

import java.util.Arrays;

public class Vendedor extends Empleado {
    private int tlf;
    private String areaVenta;
    private String[] listaClientes;
    private int numClientes; // numero de clientes que hay en el array
    private double porcentaje;
    private Coche coche;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int telefono, double salario, int tlf, String areaVenta, String[] listaClientes, int numClientes, double porcentaje, Coche coche) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.tlf = tlf;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        this.numClientes = numClientes;
        this.porcentaje = porcentaje;
        this.coche = coche;
    }

    public Vendedor(int tlf, String areaVenta, String[] listaClientes, int numClientes, double porcentaje, Coche coche) {
        this.tlf = tlf;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        this.numClientes = numClientes;
        this.porcentaje = porcentaje;
        this.coche = coche;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public String[] getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(String[] listaClientes) {
        this.listaClientes = listaClientes;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void incrementarSalario(int cantidad) {
        this.setSalario(getSalario() + 0.10 * getSalario());
    }

    public void altaCliente(){
        numClientes++;
    }

    public void bajaCliente(){
        numClientes--;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", anyosAntiguedad=" + getAnyosAntiguedad() +
                ", telefono=" + getTelefono() +
                ", salario=" + getSalario() +
                ", supervisor=" + getSupervisor().getNombre() +
                "tlf=" + tlf +
                ", areaVenta='" + areaVenta + '\'' +
                ", listaClientes=" + Arrays.toString(listaClientes) +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
