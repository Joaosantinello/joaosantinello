import java.util.Scanner;

public class PalavrasInversas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        System.out.print("Digite a terceira palavra: ");
        String palavra3 = scanner.nextLine();

        System.out.println("Palavras na ordem contrária: " + palavra3 + " " + palavra2 + " " + palavra1);

        scanner.close();
    }
}
