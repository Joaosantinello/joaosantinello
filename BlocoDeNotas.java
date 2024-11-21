import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas;

    public BlocoDeNotas() {
        notas = new ArrayList<>();
    }

    // Método para inserir uma nota
    public void inserirNota(String nota) {
        notas.add(nota);
    }

    // Método para remover uma nota (por índice)
    public boolean removerNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            notas.remove(indice);
            return true;
        }
        return false;
    }

    // Método para buscar uma nota (retorna o índice ou -1 se não encontrar)
    public int buscarNota(String conteudo) {
        return notas.indexOf(conteudo);
    }

    // Método para alterar uma nota (por índice)
    public boolean alterarNota(int indice, String novaNota) {
        if (indice >= 0 && indice < notas.size()) {
            notas.set(indice, novaNota);
            return true;
        }
        return false;
    }

    // Método para listar todas as notas
    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota cadastrada.");
        } else {
            for (int i = 0; i < notas.size(); i++) {
                System.out.println(i + ": " + notas.get(i));
            }
        }
    }
}
