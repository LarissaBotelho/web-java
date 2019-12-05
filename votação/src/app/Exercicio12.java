/*
* App java para informar se o cidadão pode votar ou não. 
* ele não pode votar se a idade for inferior a 16, 
* o voto é facultativo se a idade for igual a 16 ou 17 ou ainda maior
* do que 70, e o voto é obrigatório para idades 
* entre 18 e 70 (incluindo estes valores).
*/

package app;

//importando biblioteca

import java.util.Scanner;

//criando classe

public class Exercicio12 {

    //metodo para informar se o cidadão pode ou nao votar
    public static void main(String[] args) {

        //declarando variavel
        int idade;

        //reconhecimento de entradas

    Scanner ent = new Scanner (System.in);

    //imprime na tela

    System.out.println("Digite sua idade: ");

    //armazena na variavel

    idade = ent.nextInt();

    //inicio da condicional

    if (idade < 16)

    //imprime na tela

    {System.out.println("Eleitor não autorizado!");}

    else if

    ((idade ==16) || (idade ==17) || (idade > 70))

    //imprime na tela

    {System.out.println("Voto facultativo!");}

    else

    //imprime na tela se nenhuma das condicoes forem satisfeitas
    
    {System.out.println("Voto obrigatório!!!");}
    }
}