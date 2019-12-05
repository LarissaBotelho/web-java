package app;
//importando a biblioteca
import java.util.Scanner;

public class App {
    //Método principal para trocar os valores de variaveis
    public static void main(String[] args) {
        //reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //declarando variaveis
       int a, b, c;
        //imprime no console
       System.out.println("Entre com valor e A: ");
       //armazena na variavel
       a = ent.nextInt();
       //imprime no console
       System.out.println("Entre com valor e B: ");
       //armazena na variavel
       b = ent.nextInt();
       //realiza a troca
       c = a;
       a = b;
       b = c;
      //imprime o resultado no console 
       System.out.println("A = " + a + ", B = " + b);
    }
}