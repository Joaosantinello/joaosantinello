import java.util.Scanner;

public class NumeroQuadradoRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        // Cálculo do quadrado e da raiz quadrada
        double quadrado = Math.pow(numero, 2);
        double raizQuadrada = Math.sqrt(numero);
        
        // Impressão dos resultados
        System.out.println("Número: " + numero);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Raiz Quadrada: " + raizQuadrada);
        
        scanner.close();
    }
}
