import java.util.Scanner;

public class IntervaloComIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o limite superior
        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();

        // Lê o incremento
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.println("Números do intervalo:");

        // Loop para imprimir os números do intervalo
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            System.out.print(i + " ");
        }

        System.out.println(); // Nova linha após a impressão dos números
        scanner.close();
    }
}
