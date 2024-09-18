import javax.swing.JOptionPane;

public class AlgarismoDezenas {
    public static void main(String[] args) {
        // Solicita um número inteiro com 3 casas decimais ao usuário
        String entrada = JOptionPane.showInputDialog("Digite um número inteiro com 3 casas decimais (ex: 123456):");
        
        // Remove qualquer possível separador de casas decimais, se for necessário
        entrada = entrada.replace(".", "");
        
        // Verifica se a entrada possui pelo menos 3 dígitos
        if (entrada.length() < 3) {
            JOptionPane.showMessageDialog(null, "O número deve ter pelo menos 3 dígitos.");
            return;
        }
        
        // Extraí o algarismo da casa das dezenas (a partir da direita, contando os dígitos)
        // A casa das dezenas está a 2 posições da direita (índice -3)
        char algarismoDezenas = entrada.charAt(entrada.length() - 3);
        
        // Exibe o algarismo da casa das dezenas
        JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é: " + algarismoDezenas);
    }
}