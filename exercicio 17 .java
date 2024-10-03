import java.util.Scanner;

public class TabelaConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar limites e incremento
        System.out.print("Digite o limite inferior (graus Celsius): ");
        double limiteInferior = scanner.nextDouble();

        System.out.print("Digite o limite superior (graus Celsius): ");
        double limiteSuperior = scanner.nextDouble();

        System.out.print("Digite o incremento (graus Celsius): ");
        double incremento = scanner.nextDouble();

        System.out.printf("%-15s %-15s%n", "Celsius", "Fahrenheit");
        System.out.println("--------------------------------------");

        // Loop para imprimir a tabela de conversão
        for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9 / 5) + 32; // C = 5.(F-32)/9 => F = (C * 9/5) + 32
            System.out.printf("%-15.2f %-15.2f%n", celsius, fahrenheit);
        }

        scanner.close();
    }
}
