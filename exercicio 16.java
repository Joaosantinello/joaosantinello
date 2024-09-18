import java.util.Scanner;

public class NumeroQuadradoRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;
        double raizQuadrada = Math.sqrt(numero);

        System.out.println("Número: " + numero);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Raiz quadrada: " + raizQuadrada);

        scanner.close();
    }
}
