import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o limite superior
        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números ímpares menores que " + limiteSuperior + ":");

        // Loop para imprimir os números ímpares
        for (int i = 1; i < limiteSuperior; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println(); // Nova linha após a impressão dos números
        scanner.close();
    }
}
