/*
* App java para exibir 50 números sorteados de 1 a 100 para o usuário.
*/

package app;

//importando biblioteca

import java.util.Random;

//criando classe

public class Exercicio17 {

    //metodo para fazer o sorteio
    public static void main(String[] args) {

        //Função para gerar numeros aleatorios
        Random rand = new Random ();

        //inicio do looping

        for (int i=1; i<=50; i++)
        {
            
            int x = rand.nextInt(99);

            //imprime no console o resultado

            System.out.println(x+1+"\n");
        }
    }
}