package app;
import java.util.Scanner;

public class App {
    //Método principal para calcular a comissao e media de vendas
    public static void main(String[] args) {
        //reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //declarando constante
        float COMISSAO = 0.1f;
        //declarando variaveis
       float v1, v2, v3, v4, v5, total, media;
       //imprime no console
       System.out.println("Vendas V1: ");
       //armazena na variavel
       v1=ent.nextFloat();
       //calculo da comissao
       v1 += v1 * COMISSAO;
       //imprime no console
       System.out.println("Vendas V2: ");
       //armazena na variavel
       v2=ent.nextFloat();
       //calculo da comissao
       v2 += v2 * COMISSAO;
       //imprime no console
       System.out.println("Vendas V3: ");
       //armazena na variavel
       v3=ent.nextFloat();
       //calculo da comissao
       v3 += v3 * COMISSAO;
       //imprime no console
       System.out.println("Vendas V4: ");
       //armazena na variavel
       v4=ent.nextFloat();
       //calculo da comissao
       v4 += v4 * COMISSAO;
       //imprime no console
       System.out.println("Vendas V5: ");
       //armazena na variavel
       v5=ent.nextFloat();
       //calculo da comissao
       v5 += v5 * COMISSAO;
       //calculo do total de vendas
       total = v1 + v2 + v3 + v4 + v5;
       //calculo da media
       media = total / 5;
       //imprime o resultado no console
        System.out.println(total);
        System.out.println(media);
    }
}