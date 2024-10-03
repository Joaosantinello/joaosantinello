import java.util.Scanner;

public class LeituraConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigo;
        double kWh;
        int tipo;
        double custo;
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        double somaConsumoTipo1 = 0, somaConsumoTipo2 = 0;
        int contadorTipo1 = 0, contadorTipo2 = 0;

        System.out.println("Digite os dados do consumidor (Código 0 para encerrar):");

        while (true) {
            System.out.print("Código do consumidor: ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Quantidade de kWh consumidos: ");
            kWh = scanner.nextDouble();

            System.out.print("Tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            tipo = scanner.nextInt();

            // Calcular custo
            switch (tipo) {
                case 1: // Residencial
                    custo = kWh * 0.3;
                    totalResidencial += kWh;
                    somaConsumoTipo1 += kWh;
                    contadorTipo1++;
                    break;
                case 2: // Comercial
                    custo = kWh * 0.5;
                    totalComercial += kWh;
                    somaConsumoTipo2 += kWh;
                    contadorTipo2++;
                    break;
                case 3: // Industrial
                    custo = kWh * 0.7;
                    totalIndustrial += kWh;
                    break;
                default:
                    System.out.println("Tipo de consumidor inválido. Digite 1, 2 ou 3.");
                    continue; // Volta para o início do loop se o tipo for inválido
            }

            System.out.printf("Custo total para o consumidor %d: R$ %.2f%n", codigo, custo);
        }

        // Cálculos finais
        double totalConsumo = totalResidencial + totalComercial + totalIndustrial;
        System.out.printf("Total de consumo residencial: %.2f kWh%n", totalResidencial);
        System.out.printf("Total de consumo comercial: %.2f kWh%n", totalComercial);
        System.out.printf("Total de consumo industrial: %.2f kWh%n", totalIndustrial);
        
        if (contadorTipo1 > 0) {
            double mediaTipo1 = somaConsumoTipo1 / contadorTipo1;
            System.out.printf("Média de consumo do tipo residencial: %.2f kWh%n", mediaTipo1);
        } else {
            System.out.println("Nenhum consumidor residencial foi registrado.");
        }

        if (contadorTipo2 > 0) {
            double mediaTipo2 = somaConsumoTipo2 / contadorTipo2;
            System.out.printf("Média de consumo do tipo comercial: %.2f kWh%n", mediaTipo2);
        } else {
            System.out.println("Nenhum consumidor comercial foi registrado.");
        }

        scanner.close();
    }
}
