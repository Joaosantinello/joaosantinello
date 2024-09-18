import javax.swing.JOptionPane;

public class FuncoesTrigonometrica {
    public static void main(String[] args) {
        // Solicita um ângulo em graus ao usuário
        String entrada = JOptionPane.showInputDialog("Digite um ângulo em graus:");
        
        // Converte a entrada para um valor double
        double anguloGraus = Double.parseDouble(entrada);
        
        // Converte o ângulo para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        // Calcula seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        
        // Calcula secante, cossecante e cotangente
        double secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY;
        double cossecante = (seno != 0) ?
