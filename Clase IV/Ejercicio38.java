// Ejercicio 3.8
public class Ejercicio38 {
    public static void main(String[] args) {
        int A = 4;
        int B = 5;
        int C = 1;
        
        double resultadoA = B * A - Math.pow(B,2) / 4 * C;
        double resultadoB = (A * B) / Math.pow(3,2);
        int resultadoC = (((B + C) / 2 * A + 10) * 3 * B) - 6;

        System.out.println("El resultado de A es: " + resultadoA);
        System.out.println("El resultado de B es: " + resultadoB);
        System.out.println("El resultado de C es: " + resultadoC);
    }
}