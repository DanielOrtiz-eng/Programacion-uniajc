import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        // Declaracion de las variables para el ejercicio
        // C grados celsius, F grados farenheit
        double c, f, gradosCelcius, gradosFarenheit; 
        // Pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados Celcius");
        c = leer.nextInt();
        System.out.println("Digite los grados Farenheit");
        f = leer.nextInt ();



        leer.close();
    }

}