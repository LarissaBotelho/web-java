/*
* App java para exibir os 50 primeiros números da seqüência de Fibonacci.
* exemplo: (1,1,2,3,5,8,13,21,34,55,89,144,233,377,...). 
*/

package app;

//criando classe

public class Exercicio20 {

    //metodo para exibição da sequencia Fibonacci
    public static void main(String[] args) {

        //declarando variaveis

        long a=0, b=1, c=1;

        //inicio looping

        while (c<=50)
        {

            //imprime no console

            System.out.println(b);

            //calculo para coletar os numeros

            b=b+a;
            a=b-a;

            //incremento
            
            c++;
        }
    }
}