/*
* App java para informar um possivel emprestimo.
* diretoria + 30%, gerencia + 25% e operacional + 20%. 
*/ 

package app;

//importando a biblioteca

import java.util.Scanner;

//criando a classe

public class Exercicio15 {

    //metodo para calcular possivel emprestimo com base no cargo
    public static void main(String[] args){

        //reconhecimento e entradas

        Scanner ent = new Scanner (System.in);

        //Declarando variaveis

        float emprestimo =0, salario;
        int cargo;

        //Imprime no console

        System.out.println("Digite seu cargo: 1-Diretoria, 2-Gerência ou 3-Operacional");

        //armazena na variavel

        cargo = ent.nextInt();

        //Imprime no console

        System.out.print("Digite seu salário: R$ ");

        //armazena na variavel

        salario = ent.nextFloat();

        //Inicio da condicional

        if (cargo==1)

        //calculo do emprestimo com a porcentagem

        {emprestimo = salario*(float)0.3;}
        else if (cargo==2)

        //calculo do emprestimo com a porcentagem
        
        {emprestimo = salario*(float)0.25;}
        else if (cargo==3)

        //calculo do emprestimo com a porcentagem

        {emprestimo = salario*(float)0.2;}
        else

        //imprime no console se nao satisfazer nenhuma das condições 

        {System.out.println("Opção Inválida");}

        //imprime a resposta no console

        System.out.printf("Seu empréstimo é de R$ %.2f", emprestimo);
    }
}