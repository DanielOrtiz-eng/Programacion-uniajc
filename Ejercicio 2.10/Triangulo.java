//Ejercicio 2.10
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        double superficie = (base * altura) / 2;

        System.out.println("Superficie: " + superficie);

        sc.close();
    }
}