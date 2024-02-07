<<<<<<< HEAD
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

=======
/**
 * Vendedor
 */
public class Vendedor extends Empleado{

    private Clientes clientes[] = new Clientes[0];
    private CocheEmpresa cocheEmpresa = new CocheEmpresa();
    private String areaDeVenta = "";
    private int telefonoMovil = 0;
    private double porcentajeComision = 0;
    
    //Constructores
    public Vendedor(){

    }
    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String areaDeVenta, int telefono, double salario,
            CocheEmpresa cocheEmpresa, Clientes[] clientes, int telefonoMovil, double porcentajeComision) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.cocheEmpresa = cocheEmpresa;
        this.clientes = clientes;
        this.areaDeVenta = areaDeVenta;
        this.telefonoMovil = telefonoMovil;
        this.porcentajeComision = porcentajeComision;
    }

    public Vendedor(CocheEmpresa cocheEmpresa, Clientes[] clientes,String areaDeVenta, int telefonoMovil, double porcentajeComision) {
        this.cocheEmpresa = cocheEmpresa;
        this.clientes = clientes;
        this.areaDeVenta = areaDeVenta;
        this.telefonoMovil = telefonoMovil;
        this.porcentajeComision = porcentajeComision;
    }

    //Metodos
    public void incrementarSalario() {
        this.setSalario(this.getSalario()*1.1);
    }

    public void cambiarCoche(CocheEmpresa cocheEmpresa){

        this.cocheEmpresa = cocheEmpresa;
    }

    
    public void altaCliente(Clientes cliente){
        //creamos un nuevo array con la longitud del antigüo(this.clientes) + 1
        Clientes clientes[] = new Clientes[this.clientes.length + 1];

        for (int i = 0; i < this.clientes.length; i++) {
           clientes[i] = this.clientes[i];
        }

        clientes[this.clientes.length] = cliente;
        this.clientes = clientes;
    }
    public void bajaCliente(int indice){
        this.clientes[indice] = new Clientes();
>>>>>>> origin/main
    }

    @Override
    public String toString() {
        return "Vendedor{" +
<<<<<<< HEAD
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
=======
                "nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", DNI='" + this.getDNI() + '\'' +
                ", direccion='" + this.getDireccion() + '\'' +
                ", anyosAntiguedad=" + this.getAnyosAntiguedad() +
                ", telefono=" + this.getTelefono() +
                ", salario=" + this.getSalario() +
                ", supervisor=" + this.getSupervisor().getNombre() +
                '}';
    }

    //Getters and Setters
    public int getTelefonoMovil() {
        return telefonoMovil;
    }
    public Clientes[] getClientes() {
        return clientes;
    }
    public void setClientes(Clientes[] clientes) {
        this.clientes = clientes;
    }
    public CocheEmpresa getCocheEmpresa() {
        return cocheEmpresa;
    }
    public void setCocheEmpresa(CocheEmpresa cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }
    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    public double getPorcentajeComision() {
        return porcentajeComision;
    }
    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    public String getAreaDeVenta() {
        return areaDeVenta;
    }
    public void setAreaDeVenta(String areaDeVenta) {
        this.areaDeVenta = areaDeVenta;
    }
}
>>>>>>> origin/main
