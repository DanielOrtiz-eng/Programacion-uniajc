import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        // Declaración de variables
        double c, f, gradosCelcius, gradosFarenheit;
        // Crear un objeto Scanner para leer datos
        Scanner leer = new Scanner(System.in);
        
        // Pedir datos por teclado
        System.out.println("Digite los grados Celsius:");
        c = leer.nextDouble(); // Usamos nextDouble para leer números con decimales
        System.out.println("Digite los grados Fahrenheit:");
        f = leer.nextDouble();
        
        // Realizar las conversiones
        gradosCelcius = (f - 32) * (5.0 / 9.0);
        gradosFarenheit = c * (9.0 / 5.0) + 32;
        
        // Mostrar los resultados
        System.out.println(c + " °C es equivalente a " + gradosFarenheit + " °F");
        System.out.println(f + " °F es equivalente a " + gradosCelcius + " °C");
        
        leer.close();
    }
}
