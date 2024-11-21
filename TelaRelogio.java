import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Relogio {
    private int hora;
    private int minuto;

    public Relogio() {
        this.hora = 0;
        this.minuto = 0;
    }

    public void ticTac() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public String mostra() {
        return String.format("%02d:%02d", hora, minuto);
    }
}

public class TelaRelogio extends JFrame implements ActionListener {
    private Relogio relogio;
    private JLabel lblMostrador;
    private JButton btnTicTac, btnHora, btnMinuto;

    public TelaRelogio() {
        super("Relógio com Mostrador");
        relogio = new Relogio();

        setLayout(new FlowLayout());

        lblMostrador = new JLabel(relogio.mostra());
        lblMostrador.setFont(new Font("Arial", Font.BOLD, 40));
        add(lblMostrador);

        btnTicTac = new JButton("TicTac");
        btnHora = new JButton("Hora");
        btnMinuto = new JButton("Minuto");

        add(btnTicTac);
        add(btnHora);
        add(btnMinuto);

        btnTicTac.addActionListener(this);
        btnHora.addActionListener(this);
        btnMinuto.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTicTac) {
            relogio.ticTac();
        } else if (e.getSource() == btnHora) {
            String horaStr = JOptionPane.showInputDialog(this, "Digite a hora (0-23):");
            try {
                int hora = Integer.parseInt(horaStr);
                relogio.setHora(hora);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        } else if (e.getSource() == btnMinuto) {
            String minutoStr = JOptionPane.showInputDialog(this, "Digite o minuto (0-59):");
            try {
                int minuto = Integer.parseInt(minutoStr);
                relogio.setMinuto(minuto);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        }
        lblMostrador.setText(relogio.mostra());
    }

    public static void main(String[] args) {
        new TelaRelogio();
    }
}
