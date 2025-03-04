package control.de.aire.acondicionado;

import java.util.concurrent.TimeUnit;

public class Ejecutar {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
        System.out.println("Simulación finalizada.");
    }
    
    public void iniciarSimulacion(int ciclos) {
        AireAcondicionado aire = new AireAcondicionado();
        
        for (int i = 0; i < ciclos; i++) {
            SensorTemperatura sensorTemp = new SensorTemperatura();
            SensorHumedad sensorHum = new SensorHumedad();
            
            boolean aireEncendido = Validar.verificarAireAcondicionado(sensorTemp.getTemperatura(), sensorHum.getHumedad());
            
            System.out.println("\nTemperatura: " + sensorTemp.getTemperatura() + "°C");
            System.out.println("Humedad: " + sensorHum.getHumedad() + "%");
            aire.mostrarEstado(aireEncendido);
            
            try {
                TimeUnit.SECONDS.sleep(5); 
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación.");
            }
        }
    }
}