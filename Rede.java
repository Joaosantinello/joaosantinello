import java.util.ArrayList;

public class Rede {
    private ArrayList<Amigo> amigos;

    public Rede() {
        amigos = new ArrayList<>();
    }

    public void addAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public boolean blockAmigo(String nome) {
        int posicao = buscar(nome);
        if (posicao >= 0) {
            amigos.remove(posicao);
            return true;
        }
        return false;
    }

    public int procurarAmigo(String nome) {
        return buscar(nome);
    }

    public boolean enviarMensagem(String nome, String mensagem) {
        int posicao = buscar(nome);
        if (posicao >= 0) {
            Amigo amigo = amigos.get(posicao);
            amigo.setMensagem(mensagem);
            return true;
        }
        return false;
    }

    public Amigo[] procurarVelhos() {
        if (amigos.isEmpty()) {
            return new Amigo[0];
        }

        int maiorIdade = amigos.get(0).getIdade();

        // Encontra a maior idade
        for (Amigo amigo : amigos) {
            if (amigo.getIdade() > maiorIdade) {
                maiorIdade = amigo.getIdade();
            }
        }

        // Cria uma lista dos amigos mais velhos
        ArrayList<Amigo> maisVelhos = new ArrayList<>();
        for (Amigo amigo : amigos) {
            if (amigo.getIdade() == maiorIdade) {
                maisVelhos.add(amigo);
            }
        }

        return maisVelhos.toArray(new Amigo[0]);
    }

    private int buscar(String nome) {
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1; // Não encontrado
    }

    public void listarAmigos() {
        if (amigos.isEmpty()) {
            System.out.println("Nenhum amigo cadastrado.");
        } else {
            for (Amigo amigo : amigos) {
                System.out.println(amigo);
            }
        }
    }
}
