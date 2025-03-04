package control.de.acceso.a.una.tienda;

import java.util.Scanner;

public class Usuario {
    private final boolean tieneMembresia;
    private final boolean esEmpleado;
    
    public Usuario(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }
    
    public boolean tieneMembresia() {
        return tieneMembresia;
    }
    
    public boolean esEmpleado() {
        return esEmpleado;
    }
}
