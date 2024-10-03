public class TabelaConversaoPolegadasCentimetros {
    public static void main(String[] args) {
        // Constante para a conversão
        final double CONVERSAO = 2.54;

        System.out.printf("%-10s %-10s%n", "Polegadas", "Centímetros");
        System.out.println("-------------------------");

        // Loop para imprimir a tabela
        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = polegadas * CONVERSAO;
            System.out.printf("%-10d %-10.2f%n", polegadas, centimetros);
        }
    }
}
