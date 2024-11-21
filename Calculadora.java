import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField txtDisplay;
    private double valor1, valor2, resultado;
    private String operador;

    public Calculadora() {
        super("Calculadora");
        setLayout(new GridLayout(2, 1));

        txtDisplay = new JTextField();
        txtDisplay.setHorizontalAlignment(JTextField.RIGHT);
        add(txtDisplay);

        JPanel painelBotoes = new JPanel(new GridLayout(4, 4));

        String[] botoes = {"7", "8", "9", "+",
                           "4", "5", "6", "-",
                           "1", "2", "3", "*",
                           "0", "C", "=", "/"};

        for (String texto : botoes) {
            JButton btn = new JButton(texto);
            btn.addActionListener(this);
            painelBotoes.add(btn);
        }

        add(painelBotoes);

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        try {
            if (comando.matches("[0-9]")) { // Entrada numérica
                txtDisplay.setText(txtDisplay.getText() + comando);
            } else if (comando.equals("C")) { // Limpar
                txtDisplay.setText("");
                valor1 = valor2 = resultado = 0;
                operador = null;
            } else if (comando.equals("=")) { // Calcula resultado
                valor2 = Double.parseDouble(txtDisplay.getText());
                switch (operador) {
                    case "+":
                        resultado = valor1 + valor2;
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        break;
                    case "/":
                        if (valor2 != 0) {
                            resultado = valor1 / valor2;
                        } else {
                            txtDisplay.setText("Erro");
                            return;
                        }
                        break;
                }
                txtDisplay.setText(String.valueOf((int) resultado));
            } else { // Operadores
                valor1 = Double.parseDouble(txtDisplay.getText());
                operador = comando;
                txtDisplay.setText("");
            }
        } catch (Exception ex) {
            txtDisplay.setText("Erro");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
