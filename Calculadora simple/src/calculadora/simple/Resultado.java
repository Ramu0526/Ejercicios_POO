package calculadora.simple;

import java.util.Scanner;

public class Resultado {
    public void calcular() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese la operacion (+, -, *, /) o 'salir' para terminar: ");
            String operador = scanner.next();

            if (operador.equalsIgnoreCase("salir")) {
                break;
            }

            Ingreso num1 = new Ingreso();
            Ingreso num2 = new Ingreso();
            double resultado = Operacion.realizarOperacion(num1.getNumero(), num2.getNumero(), operador);

            if (Double.isNaN(resultado)) {
                System.out.println("Operacion inválida o division por cero.");
            } else {
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}
