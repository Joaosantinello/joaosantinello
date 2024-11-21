import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        this.caixas = new ArrayList<>();
    }

    // Método para adicionar caixa
    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    // Método para remover caixa pelo dono
    public boolean removerCaixa(String dono) {
        int posicao = buscarCaixa(dono);
        if (posicao >= 0) {
            caixas.remove(posicao);
            return true;
        }
        return false;
    }

    // Método para buscar a posição de uma caixa pelo dono
    public int buscarCaixa(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equalsIgnoreCase(dono)) {
                return i;
            }
        }
        return -1; // Não encontrado
    }

    // Método para alterar corredor e posição de uma caixa
    public boolean alterarCaixa(String dono, String novoCorredor, int novaPosicao) {
        int posicao = buscarCaixa(dono);
        if (posicao >= 0) {
            Caixa caixa = caixas.get(posicao);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
            return true;
        }
        return false;
    }

    // Método para listar caixas com peso acima de um valor
    public ArrayList<Caixa> listarCaixasMaisPesadas(double peso) {
        ArrayList<Caixa> resultado = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > peso) {
                resultado.add(caixa);
            }
        }
        return resultado;
    }

    // Método para listar todas as caixas
    public void listarCaixas() {
        if (caixas.isEmpty()) {
            System.out.println("Nenhuma caixa no depósito.");
        } else {
            for (Caixa caixa : caixas) {
                System.out.println(caixa);
            }
        }
    }
}
