import java.util.Scanner;

public class SepararData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de data no formato ddmmaa
        System.out.print("Digite a data no formato ddmmaa: ");
        int data = scanner.nextInt();

        // Separação do dia, mês e ano
        int dia = data / 10000;            // Primeiros dois dígitos (dia)
        int mes = (data / 100) % 100;      // Dois dígitos do meio (mês)
        int ano = data % 100;              // Últimos dois dígitos (ano)

        // Impressão dos resultados
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        scanner.close();
    }
}


