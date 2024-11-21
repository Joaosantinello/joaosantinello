import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTexto extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public TelaTexto() {
        super("Texto e Botões");

        // Layout do painel principal
        setLayout(new FlowLayout());

        // Criação dos componentes
        JLabel lblTexto = new JLabel("Texto:");
        txtTexto = new JTextField(20);
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        // Adiciona os componentes à tela
        add(lblTexto);
        add(txtTexto);
        add(btnMostrar);
        add(btnLimpar);
        add(btnSair);

        // Adiciona ActionListeners
        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        // Configurações da janela
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            String texto = txtTexto.getText();
            JOptionPane.showMessageDialog(this, texto, "Texto Informado", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnLimpar) {
            txtTexto.setText("");
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TelaTexto();
    }
}
