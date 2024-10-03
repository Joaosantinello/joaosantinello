import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de números pares a serem impressos
        System.out.print("Digite quantos números pares você deseja imprimir: ");
        int quantidade = scanner.nextInt();

        System.out.println("Números pares:");

        // Loop para imprimir os números pares
        for (int i = 1; i <= quantidade; i++) {
            System.out.print((i * 2) + " "); // Multiplica i por 2 para obter os números pares
        }

        System.out.println(); // Nova linha após a impressão dos números
        scanner.close();
    }
}
