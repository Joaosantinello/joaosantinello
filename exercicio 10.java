import java.util.Scanner;

public class DivisoresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite números (digite -999 para encerrar):");

        while (true) {
            numero = scanner.nextInt();
            
            if (numero == -999) {
                break;
            }

            System.out.println("Divisores de " + numero + ":");
            for (int i = 1; i <= Math.abs(numero); i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
