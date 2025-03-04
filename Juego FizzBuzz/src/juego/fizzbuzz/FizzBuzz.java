package juego.fizzbuzz;

public class FizzBuzz {
    public void jugar(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            Numero numero = new Numero(i);
            System.out.println(numero.obtenerResultado());
        }
    }
}
