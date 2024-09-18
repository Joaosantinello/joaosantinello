import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade ao usuário
        System.out.print("Digite sua idade em anos: ");
        int idade = scanner.nextInt();

        // Calcula o número aproximado de dias vividos
        double diasVividos = idade * 365.25;

        // Exibe o resultado
        System.out.printf("Você viveu aproximadamente %.0f dias.%n", diasVividos);

        scanner.close();
    }
}