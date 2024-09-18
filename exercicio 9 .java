import java.util.Scanner;

public class LogaritmoBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        // Entrada da base
        System.out.print("Digite a base do logaritmo: ");
        double base = scanner.nextDouble();
        
        // Cálculo do logaritmo na base desejada
        double logaritmo = Math.log(numero) / Math.log(base);
        
        // Impressão do resultado
        System.out.println("O logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
        
        scanner.close();
    }
}
