public class EvaluarExpresion {
    public static void main(String [] args) {
        int A = 2;
        int B = 3;
        int C = 2;

        double resultado = Math.pow(A,Math.pow(B,C));

        System.out.println("El resultado de la operación A ^ B ^ C es: " +resultado);
    }
}
