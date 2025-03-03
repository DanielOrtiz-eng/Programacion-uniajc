// Ejercicio 2.12
import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese el número de días laborales en la semana: ");
        int diasLaborales = scanner.nextInt();
        
        System.out.print("Ingrese la tarifa horaria en dólares ($): ");
        double tarifaHoraria = scanner.nextDouble();
        
        System.out.print("Ingrese las horas trabajadas en un día: ");
        double horasDiarias = scanner.nextDouble();
        
        // Calcular salario semanal
        double salarioSemanal = diasLaborales * horasDiarias * tarifaHoraria;
        
        // Imprimir el salario semanal
        System.out.println("El salario semanal es: $" + salarioSemanal);
        
        scanner.close();
    }
}
