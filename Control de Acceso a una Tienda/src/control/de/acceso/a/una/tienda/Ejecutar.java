package control.de.acceso.a.una.tienda;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
        System.out.println("Simulación finalizada.");
    }
    
    public void simularAcceso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tiene membresía? (true/false): ");
        boolean tieneMembresia = scanner.nextBoolean();
        System.out.print("¿Es empleado? (true/false): ");
        boolean esEmpleado = scanner.nextBoolean();
        
        Usuario usuario = new Usuario(tieneMembresia, esEmpleado);
        Horario horario = new Horario();
        boolean accesoPermitido = ValidarAcceso.verificarAcceso(usuario, horario);
        
        System.out.println("\nHorario de atención: " + (horario.estaEnHorario() ? "ABIERTO" : "CERRADO"));
        Resultado resultado = new Resultado();
        resultado.mostrarAcceso(accesoPermitido);
    }
}