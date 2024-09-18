import java.util.Scanner;

public class LogaritmoBase10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        // Cálculo do logaritmo na base 10
        double logaritmo = Math.log10(numero);
        
        // Impressão do resultado
        System.out.println("O logaritmo de " + numero + " na base 10 é: " + logaritmo);
        
        scanner.close();
    }
}
