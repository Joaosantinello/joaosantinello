import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores de votos para cada candidato
        int[] votos = new int[4];
        int totalEleitores = 0;
        
        System.out.println("Urna Eletrônica - Eleição para Representante de Sala");
        System.out.println("Candidatos:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("-1 - Encerrar votação");
        
        while (true) {
            System.out.print("Digite o número do candidato (1-4) ou -1 para encerrar: ");
            int voto = scanner.nextInt();
            
            if (voto == -1) {
                break; // Encerra a votação
            } else if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++; // Incrementa o voto para o candidato correspondente
                totalEleitores++; // Conta o eleitor
            } else {
                System.out.println("Voto inválido. Tente novamente.");
            }
        }
        
        // Exibe os resultados
        System.out.println("\nResultados da Eleição:");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalEleitores > 0) ? (votos[i] * 100.0 / totalEleitores) : 0;
            System.out.printf("Candidato %d: %d voto(s) (%.2f%%)%n", (i + 1), votos[i], percentual);
        }
        
        System.out.printf("Total de alunos eleitores: %d%n", totalEleitores);
        scanner.close();
    }
}
