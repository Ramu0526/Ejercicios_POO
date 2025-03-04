package sistema.de.reservas;

public class Sala {
    private final Silla[] sillas;

    public Sala(int capacidad) {
        sillas = new Silla[capacidad];
        for (int i = 0; i < capacidad; i++) {
            sillas[i] = new Silla();
        }
    }

    public boolean hayDisponibilidad() {
        for (Silla silla : sillas) {
            if (!silla.isOcupado()) {
                return true;
            }
        }
        return false;
    }

    public boolean reservarSilla(Usuario usuario) {
        for (Silla silla : sillas) {
            if (!silla.isOcupado()) {
                silla.reservar(usuario);
                return true;
            }
        }
        return false;
    }

    public void mostrarSillas() {
        System.out.print("Estado de las sillas: ");
        for (Silla silla : sillas) {
            System.out.print(silla.getInfo() + " ");
        }
        System.out.println();
    }
}
