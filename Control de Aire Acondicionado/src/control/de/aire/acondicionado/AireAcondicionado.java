package control.de.aire.acondicionado;

public class AireAcondicionado {
    public void mostrarEstado(boolean encendido) {
        System.out.println("\nEstado del aire acondicionado: " + (encendido ? "ENCENDIDO" : "APAGADO"));
    }
}