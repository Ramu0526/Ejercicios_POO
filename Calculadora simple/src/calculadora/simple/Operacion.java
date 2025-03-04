package calculadora.simple;

public class Operacion {
    public static double realizarOperacion(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return (num2 != 0) ? num1 / num2 : Double.NaN; // Evita la división por cero
            default:
                return Double.NaN; // Operación inválida
        }
    }
}
