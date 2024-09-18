import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Converte o número inteiro para double para usar com Math.pow
        double base = (double) numeroInteiro;
        double expoente = 2.0;

        // Calcula o quadrado do número usando Math.pow
        double resultado = Math.pow(base, expoente);

        // Exibe o resultado
        System.out.printf("O quadrado de %d é: %.2f%n", numeroInteiro, resultado);

        // Fecha o scanner
        scanner.close();
    }
}
