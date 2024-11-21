public class BlocoDeNotasTeste {
    public static void main(String[] args) {
        // Criação do objeto BlocoDeNotas
        BlocoDeNotas bloco = new BlocoDeNotas();

        System.out.println("### TESTES DO BLOCO DE NOTAS ###");

        // 1. Inserção de notas
        System.out.println("\nInserindo notas...");
        bloco.inserirNota("Nota 1: Comprar pão.");
        bloco.inserirNota("Nota 2: Estudar Java.");
        bloco.inserirNota("Nota 3: Ir à academia.");
        bloco.inserirNota("Nota 4: Assistir filme.");
        System.out.println("Notas inseridas com sucesso!");

        // Listar todas as notas
        System.out.println("\nNotas atuais:");
        bloco.listarNotas();

        // 2. Alteração de uma nota
        System.out.println("\nAlterando a nota no índice 2...");
        boolean alterada = bloco.alterarNota(2, "Nota 3: Fazer caminhada.");
        if (alterada) {
            System.out.println("Nota alterada com sucesso!");
        } else {
            System.out.println("Falha ao alterar a nota. Índice inválido!");
        }

        // Listar todas as notas após alteração
        System.out.println("\nNotas após a alteração:");
        bloco.listarNotas();

        // 3. Remoção de uma nota
        System.out.println("\nRemovendo a nota no índice 1...");
        boolean removida = bloco.removerNota(1);
        if (removida) {
            System.out.println("Nota removida com sucesso!");
        } else {
            System.out.println("Falha ao remover a nota. Índice inválido!");
        }

        // Listar todas as notas após remoção
        System.out.println("\nNotas após a remoção:");
        bloco.listarNotas();

        // 4. Busca por uma nota
        System.out.println("\nBuscando pela nota 'Nota 4: Assistir filme.'...");
        int indice = bloco.buscarNota("Nota 4: Assistir filme.");
        if (indice != -1) {
            System.out.println("Nota encontrada no índice: " + indice);
        } else {
            System.out.println("Nota não encontrada.");
        }

        // 5. Exibir notas após os testes
        System.out.println("\n### FIM DOS TESTES ###");
        System.out.println("Notas finais:");
        bloco.listarNotas();
    }
}
