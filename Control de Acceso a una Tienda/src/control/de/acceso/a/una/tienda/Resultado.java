package control.de.acceso.a.una.tienda;

public class Resultado {
    public void mostrarAcceso(boolean permitido) {
        System.out.println("\nAcceso a la tienda: " + (permitido ? "PERMITIDO" : "DENEGADO"));
    }
}
