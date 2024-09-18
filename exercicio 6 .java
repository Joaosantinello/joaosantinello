import java.util.Scanner;

public class NumeroConcatenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da milhar: ");
        char milhar = scanner.next().charAt(0);

        System.out.print("Digite o número da centena: ");
        char centena = scanner.next().charAt(0);

        System.out.print("Digite o número da dezena: ");
        char dezena = scanner.next().charAt(0);

        System.out.print("Digite o número da unidade: ");
        char unidade = scanner.next().charAt(0);

        // Concatenando os caracteres em uma String
        String numero = "" + milhar + centena + dezena + unidade;

        // Imprimindo o resultado
        System.out.println("O número formado é: " + numero);

        scanner.close();
    }
}
