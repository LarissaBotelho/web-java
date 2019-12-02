package app;
//importando a biblioteca
import java.util.Scanner;

public class App {
    //Método principal para calcular a area e perimetro
    public static void main(String[] args) {
        //Reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //Declarando variáveis
        int base, altura, area, perimetro;
        //Imprimindo no console
        System.out.println("Digite a medida da base");
        //Armazenando o valor da base
        base=ent.nextInt();
        //Imprimindo no console
        System.out.println("Digite a medida da altura");
        //Armazenando o valor da altura
        altura=ent.nextInt();
        //Calculando a area
        area=(base*altura);
        //Calculando o perimetro
        perimetro=(2*base+2*altura);
        //Imprime no console o resultado
        System.out.println("A medida da area é: " + area + "m2");
        System.out.println("A medida do perimetro é: " + perimetro + "cm");
    }
}