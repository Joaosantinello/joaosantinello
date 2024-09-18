import java.util.Scanner;

public class CalcularExpressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos números reais a, b e c
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        
        // Cálculo da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5
        double x = 2 * ( (a - c) / 8 ) - b * 5;
        
        // Impressão do resultado
        System.out.println("O resultado da expressão é: " + x);
        
        scanner.close();
    }
}
