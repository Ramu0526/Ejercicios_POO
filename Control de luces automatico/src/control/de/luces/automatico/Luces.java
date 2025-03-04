package control.de.luces.automatico;

public class Luces {
    public void mostrarEstado(boolean lucesEncendidas) {
        System.out.println("\nEstado de las luces: " + (lucesEncendidas ? "ENCENDIDAS" : "APAGADAS"));
    }
}
