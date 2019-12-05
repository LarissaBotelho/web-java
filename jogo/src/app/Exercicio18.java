/*
* App java para criar um jogo para o usuário descobrir um número sorteado 
* de 1 a 100. A cada tentativa dele, forneça uma dica mostrando se 
* o número é maior ou menor. Quando ele descobrir exiba uma mensagem 
* de parabéns e mostre em quantas tentativas ele conseguiu.
*/

package app;

//importando bibliotecas

import java.util.Random;
import java.util.Scanner;

//criando classe

public class Exercicio18 {

    //metodo para fazer o sorteio
    public static void main(String[] args) {

        //Função para gerar os numeros aleatorios

        Random rand = new Random();

        //reconhecimento de entradas

        Scanner ent = new Scanner (System.in);

        //declarando variaveis

        int valor=0, tentativa=0;


        int x = rand.nextInt(99);

        //inicio looping

        while (valor!=x+1)
        {
            //imprime no console

            System.out.println("Tente descobrir o número. Digite um valor; ");

            //armazena na variavel

            valor = ent.nextInt();
        
        //inicio de condicional

        if (valor<x+1)
        {
            //imprime no console

            System.out.println("O valor é maior. Tente novamente.");

            //incremento

            tentativa++;
        }

        else  if (valor>x+1)

        {
            //imprime no console

            System.out.println("O valor é menor. Tente novamente.");

            //incremento

            tentativa++;
        }

        else

            //imprime no console se o usuario acertar

            {System.out.println("Parabéns!!! Vocẽ acertou.");

            //incremento

            tentativa++;}

        //imprime no console o numero de tentativas

        System.out.println("Tentativas: " +tentativa+ "\n");
        }
    }
}