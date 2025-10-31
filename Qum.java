import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        List<Double> temperaturas = new ArrayList<>();

        
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
        }

        
        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }
        double mediaAnual = soma / 12;

        System.out.println("\nMédia anual das temperaturas: " + mediaAnual);

        
        System.out.println("\nMeses com temperatura acima da média anual:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.println(meses[i] + ": " + temperaturas.get(i));
            }
        }

        sc.close();
    }
}
