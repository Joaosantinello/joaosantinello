import javax.swing.JOptionPane;

public class SomaComprimentoStrings {
    public static void main(String[] args) {
        // Lê três Strings usando JOptionPane
        String string1 = JOptionPane.showInputDialog("Digite a primeira string:");
        String string2 = JOptionPane.showInputDialog("Digite a segunda string:");
        String string3 = JOptionPane.showInputDialog("Digite a terceira string:");

        // Calcula o comprimento de cada String
        int comprimento1 = string1.length();
        int comprimento2 = string2.length();
        int comprimento3 = string3.length();

        // Calcula a soma dos comprimentos
        int somaComprimentos = comprimento1 + comprimento2 + comprimento3;

        // Exibe o resultado em um diálogo JOptionPane
        JOptionPane.showMessageDialog(null, 
            "A soma dos comprimentos das strings é: " + somaComprimentos);
    }
}
