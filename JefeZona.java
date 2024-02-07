package AC001;

import java.util.Arrays;

public class JefeZona extends Empleado{
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, int telefono,
                    double salario, Secretario secretario, Vendedor[] vendedores, Coche coche) {

        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }

    public Secretario getSecretario() {
        return this.secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Vendedor[] getVendedores() {
        return this.vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public Coche getCoche() {
        return this.coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "JefeZona{" +
                "secretario=" + secretario +
                ", vendedores=" + Arrays.toString(vendedores) +
                ", coche=" + coche +
                "} " + super.toString();
    }

    public void cambiarSecretario(Secretario secretario){
        this.secretario = secretario;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    //to-do: rehacer método
    public void bajaVendedor(Vendedor vendedor){
        vendedor = null;
    }

    public void altaVendedor(Vendedor vendedor){
        Vendedor[] listaVend = new Vendedor[this.vendedores.length + 1];
        for (int i = 0; i < listaVend.length; i++){
            listaVend[i] = new Vendedor(vendedor);
        }
    }
}
