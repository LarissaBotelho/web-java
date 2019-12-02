package app;
import java.util.Scanner;

public class App {
    //Método principal para calcular a area e perimetro
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
       float f, c;
       System.out.println("Digite a temperauta em Fahrenheit: ");
       f=ent.nextFloat();
       c = (f-32)*5/9;
        System.out.printf("%.2f",c);
    }
}