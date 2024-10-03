import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maiorNumero = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        System.out.println("Digite vários números (digite -9999 para encerrar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            // Para o loop se o número for -9999
            if (numero == -9999) {
                break;
            }

            // Atualiza o maior número se o número atual for maior
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        // Verifica se algum número válido foi digitado
        if (maiorNumero == Integer.MIN_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("O maior número digitado foi: " + maiorNumero);
        }

        scanner.close();
    }
}
