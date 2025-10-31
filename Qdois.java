import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qdois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        int cont = 0;
        for (String p : perguntas) {
            System.out.print(p + " (s/n): ");
            String resp = sc.next().toLowerCase();
            if (resp.equals("s")) cont++;
        }
        if (cont == 2) System.out.println("Suspeita");
        else if (cont == 3 || cont == 4) System.out.println("Cúmplice");
        else if (cont == 5) System.out.println("Assassino");
        else System.out.println("Inocente");
        sc.close();
    }
}
