package app;
import java.util.Scanner;

public class App {
    //Método principal para calcular a area e perimetro
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
       int a, b, c;
       System.out.println("Entre com valor e A: ");
       a = ent.nextInt();
       System.out.println("Entre com valor e B: ");
       b = ent.nextInt();
       c = a;
       a = b;
       b = c;
       System.out.println("A = " + a + ", B = " + b);
    }
}