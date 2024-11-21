import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Rede rede = new Rede();
        int menu;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("""
                Escolha uma opção:
                1. Adicionar amigo
                2. Bloquear amigo
                3. Procurar amigo
                4. Enviar mensagem
                5. Listar mais velhos
                6. Sair
                7. Listar todos os amigos
            """));

            switch (menu) {
                case 1 -> {
                    String nome = JOptionPane.showInputDialog("Digite o nome do amigo:");
                    String sexo = JOptionPane.showInputDialog("Digite o sexo do amigo:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do amigo:"));

                    Amigo amigo = new Amigo();
                    amigo.setNome(nome);
                    amigo.setSexo(sexo);
                    amigo.setIdade(idade);

                    rede.addAmigo(amigo);
                    JOptionPane.showMessageDialog(null, "Amigo adicionado com sucesso!");
                }
                case 2 -> {
                    String nome = JOptionPane.showInputDialog("Digite o nome do amigo para bloquear:");
                    if (rede.blockAmigo(nome)) {
                        JOptionPane.showMessageDialog(null, "Amigo bloqueado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Amigo não encontrado.");
                    }
                }
                case 3 -> {
                    String nome = JOptionPane.showInputDialog("Digite o nome do amigo para procurar:");
                    int posicao = rede.procurarAmigo(nome);
                    if (posicao >= 0) {
                        JOptionPane.showMessageDialog(null, "Amigo encontrado na posição: " + posicao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Amigo não encontrado.");
                    }
                }
                case 4 -> {
                    String nome = JOptionPane.showInputDialog("Digite o nome do amigo para enviar mensagem:");
                    String mensagem = JOptionPane.showInputDialog("Digite a mensagem (máx 144 caracteres):");
                    if (rede.enviarMensagem(nome, mensagem)) {
                        JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Amigo não encontrado.");
                    }
                }
                case 5 -> {
                    Amigo[] maisVelhos = rede.procurarVelhos();
                    StringBuilder resultado = new StringBuilder("Amigos mais velhos:\n");
                    for (Amigo amigo : maisVelhos) {
                        resultado.append(amigo).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, resultado.toString());
                }
                case 6 -> JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                case 7 -> {
                    rede.listarAmigos();
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (menu != 6);
    }
}
