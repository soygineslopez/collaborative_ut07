package AC001;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int telefono;

    public Cliente(String nombre, String apellidos, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    public Cliente(final Cliente cliente) {
        this.nombre = cliente.getNombre();
        this.apellidos = cliente.getApellidos();
        this.telefono = cliente.getTelefono();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
