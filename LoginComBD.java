import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginComBD {
    public static void criarTela() {
        JFrame tela = new JFrame("Login");
        JTextField usernameField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        JButton loginButton = new JButton("Login");
        JLabel mensagemLabel = new JLabel("");

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(3, 2, 5, 5));
        painelDeConteudo.add(new JLabel("Usuário:"));
        painelDeConteudo.add(usernameField);
        painelDeConteudo.add(new JLabel("Senha:"));
        painelDeConteudo.add(passwordField);
        painelDeConteudo.add(loginButton);
        painelDeConteudo.add(mensagemLabel);

        loginButton.addActionListener((e) -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (validarUsuario(username, password)) {
                mensagemLabel.setText("Login bem-sucedido!");
            } else {
                mensagemLabel.setText("Usuário ou senha inválidos.");
            }
        });

        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

    private static boolean validarUsuario(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/sua_base_de_dados";
        String user = "seu_usuario";
        String pass = "sua_senha";

        String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // Retorna true se encontrar um registro
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginComBD::criarTela);
    }
}
