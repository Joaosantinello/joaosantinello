import java.util.Scanner;

public class PesoInformado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.println("O peso informado foi " + peso + " kg.");

        scanner.close();
    }
}
