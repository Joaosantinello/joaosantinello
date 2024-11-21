import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TesteDeposito {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Adicionar caixa\n" +
                    "2. Remover caixa\n" +
                    "3. Procurar caixa\n" +
                    "4. Alterar caixa\n" +
                    "5. Listar caixas mais pesadas que 10.0 kg\n" +
                    "6. Listar todas as caixas\n" +
                    "7. Sair"
            ));

            switch (opcao) {
                case 1: // Adicionar caixa
                    String corredor = JOptionPane.showInputDialog("Digite o corredor:");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono:");
                    deposito.adicionarCaixa(new Caixa(corredor, posicao, peso, dono));
                    JOptionPane.showMessageDialog(null, "Caixa adicionada com sucesso!");
                    break;

                case 2: // Remover caixa
                    String donoRemover = JOptionPane.showInputDialog("Digite o nome do dono da caixa a remover:");
                    if (deposito.removerCaixa(donoRemover)) {
                        JOptionPane.showMessageDialog(null, "Caixa removida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;

                case 3: // Procurar caixa
                    String donoProcurar = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
                    int posicaoEncontrada = deposito.buscarCaixa(donoProcurar);
                    if (posicaoEncontrada >= 0) {
                        JOptionPane.showMessageDialog(null, "Caixa encontrada: " + deposito.listarCaixas().get(posicaoEncontrada));
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;

                case 4: // Alterar caixa
                    String donoAlterar = JOptionPane.showInputDialog("Digite o nome do dono da caixa a alterar:");
                    String novoCorredor = JOptionPane.showInputDialog("Digite o novo corredor:");
                    int novaPosicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova posição:"));
                    if (deposito.alterarCaixa(donoAlterar, novoCorredor, novaPosicao)) {
                        JOptionPane.showMessageDialog(null, "Caixa alterada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;

                case 5: // Listar caixas mais pesadas
                    ArrayList<Caixa> caixasPesadas = deposito.listarCaixasMaisPesadas(10.0);
                    if (caixasPesadas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada acima de 10.0 kg.");
                    } else {
                        StringBuilder resultado = new StringBuilder("Caixas mais pesadas que 10.0 kg:\n");
                        for (Caixa caixa : caixasPesadas) {
                            resultado.append(caixa).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, resultado.toString());
                    }
                    break;

                case 6: // Listar todas as caixas
                    deposito.listarCaixas();
                    break;

                case 7: // Sair
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 7);
    }
}
