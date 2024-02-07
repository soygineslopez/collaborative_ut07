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
    }

    @Override
    public String toString() {
        return "Vendedor{" +
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