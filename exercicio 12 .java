import java.util.Scanner;

public class IdadePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        int totalMenosDe21 = 0;
        int totalMaisDe50 = 0;

        System.out.println("Digite as idades das pessoas (digite uma idade fora da faixa 0-120 para encerrar):");

        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            // Verifica se a idade está fora da faixa
            if (idade < 0 || idade > 120) {
                break;
            }

            // Contabiliza as idades
            if (idade < 21) {
                totalMenosDe21++;
            } else if (idade > 50) {
                totalMaisDe50++;
            }
        }

        // Exibe os resultados
        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenosDe21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaisDe50);

        scanner.close();
    }
}
