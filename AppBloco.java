import javax.swing.JOptionPane;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        int menu;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("""
                Escolha uma opção:
                1. Inserir nota
                2. Remover nota
                3. Alterar nota
                4. Listar todas as notas
                5. Sair
            """));

            switch (menu) {
                case 1 -> {
                    String nota = JOptionPane.showInputDialog("Digite a nota a ser inserida:");
                    bloco.inserirNota(nota);
                    JOptionPane.showMessageDialog(null, "Nota inserida com sucesso!");
                }
                case 2 -> {
                    bloco.listarNotas();
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da nota a ser removida:"));
                    if (bloco.removerNota(indice)) {
                        JOptionPane.showMessageDialog(null, "Nota removida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido!");
                    }
                }
                case 3 -> {
                    bloco.listarNotas();
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da nota a ser alterada:"));
                    String novaNota = JOptionPane.showInputDialog("Digite a nova nota:");
                    if (bloco.alterarNota(indice, novaNota)) {
                        JOptionPane.showMessageDialog(null, "Nota alterada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido!");
                    }
                }
                case 4 -> {
                    System.out.println("Notas cadastradas:");
                    bloco.listarNotas();
                }
                case 5 -> JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (menu != 5);
    }
}

