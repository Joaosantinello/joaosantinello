import java.util.Scanner;

public class SepararDataString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de data no formato dd/mm/aa
        System.out.print("Digite a data no formato dd/mm/aa: ");
        String data = scanner.nextLine();

        // Separação do dia, mês e ano
        String[] partes = data.split("/"); // Divide a string em partes usando o delimitador "/"
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        // Impressão dos resultados
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        scanner.close();
    }
}


