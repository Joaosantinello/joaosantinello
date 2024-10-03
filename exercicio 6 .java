import java.util.Scanner;

public class RaizEInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Digite números (digite -999 para encerrar):");

        while (true) {
            numero = scanner.nextDouble();
            
            if (numero == -999) {
                break;
            }

            if (numero >= 0) {
                System.out.println("Raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
            } else {
                System.out.println("Número negativo. Raiz quadrada não pode ser calculada.");
            }

            if (numero != 0) {
                System.out.println("Inverso de " + numero + " é: " + (1 / numero));
            } else {
                System.out.println("Inverso não pode ser calculado para zero.");
            }
        }

        scanner.close();
    }
}
