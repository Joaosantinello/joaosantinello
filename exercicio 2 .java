import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a medida da base ao usuário
        System.out.print("Digite a medida da base do retângulo (em metros): ");
        double base = scanner.nextDouble();

        // Solicita a medida da altura ao usuário
        System.out.print("Digite a medida da altura do retângulo (em metros): ");
        double altura = scanner.nextDouble();

        // Calcula a área do retângulo
        double area = base * altura;

        // Exibe o resultado
        System.out.printf("A área do retângulo é: %.2f metros quadrados.%n", area);

        // Fecha o scanner
        scanner.close();
    }
}
