package app;
//Importando a biblioteca
import java.util.Scanner;

public class App {
    // Método principal para transformar a temperatura de Fº em Cº
    public static void main(String[] args) {
        //Reconhecimento de entradas
        Scanner ent = new Scanner(System.in);
        //declarando variáveis
        float f, c;
        //imprime no console
        System.out.println("Digite a temperauta em Fahrenheit: ");
        //armazena o valor na variavel
        f = ent.nextFloat();
        //realiza o calculo
        c = (f - 32) * 5 / 9;
        //imprime o resultado no console
        System.out.printf("%.2f", c);
    }
}