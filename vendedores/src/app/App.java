package app;
import java.util.Scanner;

public class App {
    //Método principal para calcular a area e perimetro
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        float COMISSAO = 0.1f;
       float v1, v2, v3, v4, v5, total, media;
       System.out.println("Vendas V1: ");
       v1=ent.nextFloat();
       v1 += v1 * COMISSAO;
       System.out.println("Vendas V2: ");
       v2=ent.nextFloat();
       v2 += v2 * COMISSAO;
       System.out.println("Vendas V3: ");
       v3=ent.nextFloat();
       v3 += v3 * COMISSAO;
       System.out.println("Vendas V4: ");
       v4=ent.nextFloat();
       v4 += v4 * COMISSAO;
       System.out.println("Vendas V5: ");
       v5=ent.nextFloat();
       v5 += v5 * COMISSAO;
       total = v1 + v2 + v3 + v4 + v5;
       media = total / 5;
       
       
        System.out.println(total);
        System.out.println(media);
    }
}