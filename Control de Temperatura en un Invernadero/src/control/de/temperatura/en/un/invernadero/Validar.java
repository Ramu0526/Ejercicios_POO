package control.de.temperatura.en.un.invernadero;

public class Validar {
    public static String verificarEstado(double temperatura) {
        if (temperatura < 10) {
            return "Calefactor ACTIVADO";
        } else if (temperatura > 25) {
            return "Ventilador ACTIVADO";
        } else {
            return "Sistema INACTIVO";
        }
    }
}
