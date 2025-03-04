package control.de.aire.acondicionado;

public class Validar {
    public static boolean verificarAireAcondicionado(int temperatura, int humedad) {
        return (temperatura > 28 && humedad > 60) || (temperatura > 30);
    }
}