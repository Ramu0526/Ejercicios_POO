package control.de.temperatura.en.un.invernadero;

public class EjecutarSimulacion {
    public static void main(String[] args) {
        Resultado resultado = new Resultado();
        resultado.iniciarMonitoreo(5); 
        System.out.println("Simulación finalizada.");
    }
}
