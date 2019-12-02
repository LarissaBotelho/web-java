package app;
//importa a biblioteca
import java.util.Scanner;
//Criação da classe
public class App {
    //Método principal para calculo do imc
    public static void main(String[] args) {
        //Processo de reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //Declarando variáveis
        float peso=0, altura=0, imc=0;
        //Imprime no console
        System.out.println("Digite o seu peso");
        //Armazena o valor na variável
        peso=ent.nextFloat();
        //Imprime no console
        System.out.println("Digite a sua altura");
        //Armazena o valor na variável
        altura=ent.nextFloat();
        //Calcula o imc
        imc=peso/(altura*altura);
        //Imprime o resultado no console
        System.out.println("O imc é: " + imc);
    }
}