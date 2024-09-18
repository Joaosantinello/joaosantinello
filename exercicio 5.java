import java.util.Scanner;

public class PalavraFormada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];

        System.out.println("Digite 10 caracteres:");

        // Ler 10 caracteres
        for (int i = 0; i < 10; i++) {
            System.out.print("Caracter " + (i + 1) + ": ");
            caracteres[i] = scanner.next().charAt(0);
        }

        // Formar a palavra
        StringBuilder palavra = new StringBuilder();
        for (char c : caracteres) {
            palavra.append(c);
        }

        // Imprimir a palavra formada
        System.out.println("A palavra formada é: " + palavra.toString());

        scanner.close();
    }
}

