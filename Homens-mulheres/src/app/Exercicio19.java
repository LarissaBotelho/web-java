/*
* App java para determinar a quantidade de homens e mulheres 
* (separadamente) que são maiores de idade, 
* baseado numa lista de 10 pessoas.
*/

package app;

//importando biblioteca

import java.util.Scanner;

//criando classe

public class Exercicio19 {

    //metodo para informar a quantidade de homens e mulheres maiores de idade 
    public static void main(String[] args) {

        //reconhecimento de entradas

        Scanner ent = new Scanner(System.in);

        //declarando variaveis

        int idade, sexo, cont=0, contmasc=0, contfem=0;

        //inicio looping

        while (cont<=10)
        {
            //imprime no console

            System.out.println("Digite sua idade");

            //armazena na variavel

            idade = ent.nextInt();

            //imprime no console

            System.out.println("Digite seu sexo: 1-Fem 2-Masc");

            //armazena na variavel

            sexo = ent.nextInt();

            //inicio condicional

            if ((sexo!=1) && (sexo!=2))

                //imprime no console

                {System.out.println("opção inválida");

                //decremento
                
                cont--;}

                //inicio condicional

                if ((sexo==1) && (idade>=18))

                //incremento

                {contfem++;}


                else if ((sexo==2) && (idade>=18))

                //incremento
                {contmasc++;}

                //incremento
                cont++;
        }

        //imprime no console o resultado

        System.out.println("A quantidade de mulheres maiores de idade é:" +contfem+ " mulheres.");
        System.out.println("A quantidade de homens maiores de idade é:" +contmasc+ " homens.");
    }
}