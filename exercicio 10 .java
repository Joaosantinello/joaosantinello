import java.util.Scanner;

public class EmbaralharFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada das três frases
        System.out.println("Digite a primeira frase:");
        String frase1 = scanner.nextLine();
        
        System.out.println("Digite a segunda frase:");
        String frase2 = scanner.nextLine();
        
        System.out.println("Digite a terceira frase:");
        String frase3 = scanner.nextLine();
        
        // Função para dividir cada frase ao meio
        String[] metades1 = dividirAoMeio(frase1);
        String[] metades2 = dividirAoMeio(frase2);
        String[] metades3 = dividirAoMeio(frase3);
        
        // Embaralhamento das frases conforme a ordem dada
        String fraseEmbaralhada = metades2[0] + metades3[1] + metades2[1] +
                                  metades1[0] + metades3[0] + metades1[1];
        
        // Concatenação das frases originais
        String fraseConcatenada = frase1 + frase2 + frase3;
        
        // Impressão do resultado
        System.out.println("Frases concatenadas: " + fraseConcatenada);
        System.out.println("Frase embaralhada: " + fraseEmbaralhada);
        
        scanner.close();
    }
    
    // Função para dividir uma frase ao meio
    public static String[] dividirAoMeio(String frase) {
        int meio = frase.length() / 2;
        String primeiraMetade = frase.substring(0, meio);
        String segundaMetade = frase.substring(meio);
        return new String[] {primeiraMetade, segundaMetade};
    }
}

