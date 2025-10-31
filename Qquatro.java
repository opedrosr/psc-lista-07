import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qquatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> vendas = new ArrayList<>();
        System.out.print("Quantos vendedores são? ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Vendas brutas do vendedor " + (i + 1) + ": ");
            vendas.add(sc.nextDouble());
        }
        int[] contadores = new int[9];
        for (double v : vendas) {
            double salario = 200 + (v * 0.09);
            if (salario >= 1000) contadores[8]++;
            else contadores[(int)(salario / 100) - 2]++;
        }
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);
        sc.close();
    }
}
