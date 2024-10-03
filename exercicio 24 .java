import java.util.Scanner;

public class CalculoTotalMercadorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            double preco;
            int quantidade;

            // Lê o preço e valida se é não negativo
            do {
                System.out.print("Digite o preço da mercadoria (negativo para sair): ");
                preco = scanner.nextDouble();
                if (preco < 0) {
                    System.out.println("Preço não pode ser negativo. Tente novamente.");
                }
            } while (preco < 0);

            // Lê a quantidade e valida se é não negativa
            do {
                System.out.print("Digite a quantidade de itens comprados (0 para finalizar): ");
                quantidade = scanner.nextInt();
                if (quantidade < 0) {
                    System.out.println("Quantidade não pode ser negativa. Tente novamente.");
                }
            } while (quantidade < 0);

            // Se a quantidade for 0, finaliza o loop
            if (quantidade == 0) {
                break;
            }

            // Calcula o total a ser pago
            total += preco * quantidade;
        }

        // Exibe o total a ser pago
        System.out.printf("Total a ser pago: R$ %.2f%n", total);
        scanner.close();
    }
}
