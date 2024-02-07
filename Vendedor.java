package AC001;

import java.util.Arrays;

public class Vendedor extends Empleado{
    private Coche cocheEmpresa;
    private int telefono;
    private String areaVenta;
    private Cliente[] cliente;
    private double comisionVenta;   // En %


    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int telefono,
                    double salario, Coche cocheEmpresa, int telefono1, String areaVenta,
                    Cliente[] clientes, double comisionVenta) {

        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.cocheEmpresa = cocheEmpresa;
        this.telefono = telefono1;
        this.areaVenta = areaVenta;
        this.cliente = clientes;
        this.comisionVenta = comisionVenta;
        this.setSalario((1+0.10) * getAnyosAntiguedad());
    }
    public Vendedor(final Vendedor vendedor){
        setNombre(vendedor.getNombre());
        setApellidos(vendedor.getApellidos());
        setDNI(vendedor.getDNI());
        setDireccion(vendedor.getDireccion());
        setTelefono(vendedor.getTelefono());
        setSalario(vendedor.getSalario());
        this.cocheEmpresa = vendedor.cocheEmpresa;
        this.telefono = vendedor.telefono; // Conflicto, dos telefonos
        this.areaVenta = vendedor.areaVenta;
        this.cliente = vendedor.cliente;
        this.comisionVenta = vendedor.comisionVenta;

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "cocheEmpresa=" + cocheEmpresa +
                ", telefono=" + telefono +
                ", areaVenta='" + areaVenta + '\'' +
                ", cliente=" + cliente +
                ", comisionVenta=" + comisionVenta +
                "} " + super.toString();
    }

    public void altaCliente(Cliente cliente){
        //
    }
    public void bajaCliente(Cliente cliente){
        cliente.setNombre(null);
        cliente.setApellidos(null);
        cliente.setTelefono(0);
    }
    public void cambiarCoche(String marca, String matricula, String modelo){
        cocheEmpresa.setMarca(marca);
        cocheEmpresa.setMatricula(matricula);
        cocheEmpresa.setModelo(modelo);
    }
}
