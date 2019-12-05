/*
* App java para receber o valor do salário bruto, o valor dos
* descontos e o valor do possível empréstimo de um cliente, 
* em seguida avisar se ele poderá ou não fazer o empréstimo. 
*/

package app;

//importando biblioteca

import java.util.Scanner;

//criando classe

public class Exercicio11 {

    //metodo para calcular possivel emprestimo
    public static void main(String[] args){

        //reconhecimento de entradas

        Scanner ent = new Scanner (System.in);

        /*criação das variáveis:
         * PE - Pedido de empreśtimo;
         * SB - salário bruto;
         * VTD - Valor total descontos;
         * SL - salário liquido;
         * VE - valor emprśtimo;
         */

        float PE, SB, VTD, SL, VE;

        //imprime no console
        
        System.out.print("Informe o valor do empréstimo desejado: R$ ");

        //armazena na variavel

        PE = ent.nextFloat();

        //imprime no console

        System.out.print("Informe o salário bruto: R$ ");

        //armazena na variavel

        SB = ent.nextFloat();

        //imprime no console

        System.out.print("Informe o total de descontos (VR, VT, FGTS,...: R$ ");

        //armazena na variavel

        VTD = ent.nextFloat();

        //inicio do calculo
        
        SL = SB-VTD;
        VE = SL*(float)0.3;

        //imprime no console

        System.out.printf("O valor do seu empréstimo é de R$ %.2f", VE);

        //criação da condicional

        if (PE>VE)

            //imprime no console

            {System.out.println("\n Empréstimo Negado!!!");}
            
        else

            //imprime no console

            {System.out.println("\n Empréstimo Aprovado!!!");}
    }
}