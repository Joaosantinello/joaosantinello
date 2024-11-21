import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Amigo {
    private String nome;
    private String sexo;
    private int idade;
    private String mensagem;

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getMensagem() {
        return mensagem;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMensagem(String mensagem) {
        if (mensagem.length() <= 144) {
            this.mensagem = mensagem;
        } else {
            // Trunca a mensagem para no máximo 144 caracteres
            this.mensagem = mensagem.substring(0, 144);
        }
    }

    @Override
    public String toString() {
        return "[Nome: " + nome + "] [Sexo: " + sexo + "] [Idade: " + idade + "]\n[Mensagem: " + mensagem + "]";
    }
}
