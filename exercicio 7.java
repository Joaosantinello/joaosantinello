public class MultiplosDeCinco {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 no intervalo de 1 a 500:");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
