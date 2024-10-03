import java.util.Scanner;

public class NomeIdadeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");
            
            // Lê o nome
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            // Lê a idade
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            // Lê o sexo
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa o buffer

            // Verifica se a pessoa é do sexo masculino e tem mais de 21 anos
            if (sexo == 'M' || sexo == 'm') {
                if (idade > 21) {
                    System.out.println("Nome: " + nome);
                }
            }
        }

        scanner.close();
    }
}
