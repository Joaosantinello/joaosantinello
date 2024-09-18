import javax.swing.JOptionPane;

public class DividaJurosCompostos {
    public static void main(String[] args) {
        // Definindo os valores
        double valorInicial = 100.00; // Valor inicial da dívida em reais
        double taxaJuros = 10.0;      // Taxa de juros em porcentagem
        int numeroMeses = 8;          // Número de meses

        // Calculando o valor final usando a fórmula dos juros compostos
        double valorFinal = valorInicial * Math.pow((1 + taxaJuros / 100), numeroMeses);

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, 
            String.format("Depois de %d meses, com uma taxa de juros de %.2f%%, a dívida será de R$ %.2f.", 
            numeroMeses, taxaJuros, valorFinal));
    }
}
