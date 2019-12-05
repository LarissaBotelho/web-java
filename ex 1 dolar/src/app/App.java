package app;
//Importando a biblioteca 
import java.util.Scanner;
//Criando a classe
public class App {
    //Criando o método principal para alterar o valor
    public static void main(String[] args) {
        //Processo de reconhecimento das entradas
        Scanner ent = new Scanner (System.in);
        //Criando variável para armazenar os valores de dolar e resultado
        float dolar=0 , resultado;
        //Processo para imprimir no console
        System.out.println("Digite o valor em dólar: ");
        //Armazena a informação inserida
        dolar=ent.nextFloat();
        //Transforma o valor armazenado em real
        resultado=dolar * 2.5f;
        //Informa o resultado no console
        System.out.println("O valor em reais é: " + resultado);
    }
}