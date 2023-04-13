import java.util.Arrays;

public class FaturamentoMensal {
    public static void main(String[] args) {
        double[] faturamentoDiario = {1000.0, 1500.0, 2000.0, 500.0, 0.0, 0.0, 1200.0, 800.0, 1300.0, 1800.0, 900.0, 1100.0, 1700.0, 1400.0, 2500.0, 1600.0, 1900.0, 2200.0, 2000.0, 1200.0, 1000.0, 0.0, 0.0, 800.0, 600.0, 1100.0, 900.0, 1500.0, 1300.0};
        
        double min = faturamentoDiario[0];
        double max = faturamentoDiario[0];
        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] < min) {
                min = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > max) {
                max = faturamentoDiario[i];
            }
        }
        System.out.println("Menor valor de faturamento: " + min);
        System.out.println("Maior valor de faturamento: " + max);
        
        double total = 0.0;
        int numDiasUteis = 0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > 0.0) {
                total += faturamentoDiario[i];
                numDiasUteis++;
            }
        }
        double media = total / numDiasUteis;
        
        int numDiasAcimaDaMedia = 0;
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > media) {
                numDiasAcimaDaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaDaMedia);
    }
}
