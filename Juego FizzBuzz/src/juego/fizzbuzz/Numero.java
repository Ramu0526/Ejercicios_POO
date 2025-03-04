package juego.fizzbuzz;

public class Numero {
    private final int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public String obtenerResultado() {
        if (valor % 3 == 0 && valor % 5 == 0) {
            return "FizzBuzz";
        } else if (valor % 3 == 0) {
            return "Fizz";
        } else if (valor % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(valor);
        }
    }
}
