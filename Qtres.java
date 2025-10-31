import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qtres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        System.out.println("Digite notas (-1 para terminar):");
        while (true) {
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
        }
        if (notas.isEmpty()) {
            System.out.println("Nenhum valor informado.");
            sc.close();
            return;
        }
        double soma = 0;
        for (double n : notas) soma += n;
        double media = soma / notas.size();
        System.out.println("Quantidade de valores: " + notas.size());
        System.out.print("Valores: ");
        for (double n : notas) System.out.print(n + " ");
        System.out.println("\nValores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) System.out.println(notas.get(i));
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        int acima = 0, abaixoSete = 0;
        for (double n : notas) {
            if (n > media) acima++;
            if (n < 7) abaixoSete++;
        }
        System.out.println("Acima da média: " + acima);
        System.out.println("Abaixo de sete: " + abaixoSete);
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
