public class EncontrarValor {
    public static void main(String[] args) {
        System.out.println("a) " + (9 - 5 - 3));
        System.out.println("b) " + (2 / 3 + 3 / 5));
        System.out.println("c) " + (9 / 2 / 5));
        System.out.println("d) " + (7 % 5 % 3));
        System.out.println("e) " + (7 % (5 % 3)));
        System.out.println("f) " + ((7 % 5) % 3));
        System.out.println("g) " + ((7 % 5 % 3)));
        System.out.println("h) " + (((12 + 3) / 2) / (8 - (5 + 1))));
        System.out.println("i) " + (12 / 2 * 3));
        System.out.println("j) " + Math.sqrt(Math.pow(4, 2)));
        System.out.println("k) " + Math.pow(Math.sqrt(Math.pow(4, 2)), 2));
        System.out.println("l) " + (Math.floor(815) + Math.round(815)));
    }
}
