import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante PI
        final double PI = 3.14159;

        // Entrada do valor do raio
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();
        
        // Cálculo da área do círculo
        double area = PI * raio * raio;
        
        // Impressão do resultado
        System.out.println("A área do círculo é: " + area);
        
        scanner.close();
    }
}
