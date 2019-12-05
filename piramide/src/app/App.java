package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int linhas, a;
        System.out.println("Digite o número de linhas da pirâmide:");
        linhas = ent.nextInt();

        for (int b=1; b<=linhas; b++)
        {
            for (a=1; a<=b; a++)
            {System.out.printf("%d", b);}
            System.out.println("\n");
        }
    }
}