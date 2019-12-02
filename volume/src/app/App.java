package app;
//Importando biblioteca
import java.util.Scanner;

public class App {
    //Método principal para calcular a area e perimetro
    public static void main(String[] args) {
        //Reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //Declarando variáveis
        //v = volume, r = raio, a = altura
        float v, r, a;
        float PI=3.14159f;
        //Imprimindo no console
        System.out.println("Insira o raio:");
        //Armazenando o valor do raio
        r=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Insira a altura");
        //Armazenando o valor da altura
        a=ent.nextFloat();
        //Calculando o volume
        v=PI * (r * r) * a;
        //Imprime no console o resultado
        System.out.printf("O volume é: %.2f", v );
        
    }
}