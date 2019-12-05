/*
* App java para informar os numeros pares de 10 a 200.
* tambem informa os numeros primos
*/

package app;

//criando a classe

public class Exercicio16 {

    //metodo para imprimir numeros pares e primos de 10 a 200
    public static void main(String[] args) {

        //declarando variaveis

        int numeros, r, cont=0;

        //imprime no console

        System.out.println("Os números pares são: ");

        //inicia looping

        for (numeros=10;numeros<=200;numeros++)
        {

            //criação de condicional

            if (numeros%2==0)

            //imprime resposta no console

            {System.out.println(numeros);}
        }

        //imprime no console

        System.out.println("\nOs números primos são: ");

        //inicia looping

        for (numeros=10; numeros<=200; numeros++)
        {
            //inicia a variavel

            cont=0;

            //criação de looping for

            for (r=1; r<=numeros;r++)
            {

                //criação de condicional

                if (numeros % r ==0)
                    {cont++;}
            }
            
            if (cont==2)

            //imprime resposta no console

            {System.out.println(numeros);}
        }
    }
} 