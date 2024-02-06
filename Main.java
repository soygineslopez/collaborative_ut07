package AC001;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Nicolas", "Santos Aledo", "48736995H",
                "Blasco Ibáñez", 653143185, 1850.95);

        Empleado supervisor = new Empleado("Andres", "Belmonte", "9854995H",
                "Cox Campo", 695412365, 13582.60);

        empleado.setSupervisor(supervisor);

        System.out.println(empleado.toString());
    }
}
