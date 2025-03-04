package control.de.acceso.a.una.tienda;

import java.util.Random;

public class Horario {
    private final boolean dentroHorario;
    
    public Horario() {
        this.dentroHorario = generarHorario();
    }
    
    private boolean generarHorario() {
        Random random = new Random();
        return random.nextBoolean(); // Simula si la tienda está en horario de atención o no
    }
    
    public boolean estaEnHorario() {
        return dentroHorario;
    }
}