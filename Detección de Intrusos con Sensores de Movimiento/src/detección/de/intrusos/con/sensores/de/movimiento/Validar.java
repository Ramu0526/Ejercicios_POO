package detección.de.intrusos.con.sensores.de.movimiento;

public class Validar {
    public static boolean verificarAlarma(boolean noche, boolean s1, boolean s2, boolean s3) {
        int sensoresActivos = (s1 ? 1 : 0) + (s2 ? 1 : 0) + (s3 ? 1 : 0);
        return noche && sensoresActivos >= 2;
    }
}
