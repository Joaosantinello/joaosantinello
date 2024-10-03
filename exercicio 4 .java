import java.util.Scanner;

public class NumerosEntre100e200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Digite vários números (digite 0 para parar):");

        while (true) {
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 100 e 200: " + contador);
        scanner.close();
    }
}
