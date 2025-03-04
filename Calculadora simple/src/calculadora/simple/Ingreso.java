package calculadora.simple;

import java.util.Scanner;

public class Ingreso {
    private final double numero;

    public Ingreso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        this.numero = scanner.nextDouble();
    }

    public double getNumero() {
        return numero;
    }
}
