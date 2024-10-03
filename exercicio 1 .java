public class NumerosPares {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; contador < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contador++;
            }
        }
    }
}
