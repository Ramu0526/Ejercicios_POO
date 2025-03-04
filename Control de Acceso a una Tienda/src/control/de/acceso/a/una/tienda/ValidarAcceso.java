package control.de.acceso.a.una.tienda;

public class ValidarAcceso {
    public static boolean verificarAcceso(Usuario usuario, Horario horario) {
        return (usuario.tieneMembresia() && horario.estaEnHorario()) || usuario.esEmpleado();
    }
}