package sistema.de.reservas;


public class Silla {
    private boolean ocupado;
    private Usuario usuario;

    public Silla() {
        this.ocupado = false;
        this.usuario = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void reservar(Usuario usuario) {
        this.ocupado = true;
        this.usuario = usuario;
    }

    public String getInfo() {
        return ocupado ? "[Reservada] (" + usuario.getNombre() + ")" : "[Disponible]";
    }
}
