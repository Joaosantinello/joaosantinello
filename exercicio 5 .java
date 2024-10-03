import java.util.Scanner;

public class LeituraDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite os nomes (digite 'FIM' para encerrar):");

        while (true) {
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.println("Nome digitado: " + nome);
        }

        scanner.close();
    }
}
