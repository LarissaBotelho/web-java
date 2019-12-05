/*
* App java para informar a validade do aniversario do usuario.
* o usuario deve informar somente o numero do dia e mes e entao
* recebera a resposta se o valor é valido e o nome do mes.
*/

package app;

//importando biblioteca

import java.util.Scanner;

//criando classe

public class Exercicio13 {

    //metodo para validar data de aniversario e informar o nome do mes
    public static void main(String[] args) {

        //reconhecimento de entradas

        Scanner ent = new Scanner(System.in);

        //declarando variaveis

        int dia, mes, idade, cont = 0, opcao;
        String nome;

        // laço de repetição para 2 pessoas

        while (cont < 2) {

            //imprime no console
            
            System.out.println("Digite seu nome: ");

            //armazena na variavel

            nome = ent.next();

            //imprime no console

            System.out.println("Digite sua idade: ");

            //armazena na variavel

            idade = ent.nextInt();

            //imprime no console

            System.out.println("Digite o dia do seu nascimento(DD): ");

            //armazena na variavel

            dia = ent.nextInt();

            //imprime no console

            System.out.println("Digite o mês do seu nascimento(MM): ");

            //armazena na variavel

            mes = ent.nextInt();

            //abrindo condicional switch

            switch (mes) {

                //primeiro caso

            case 1:

                //condicional if

                if ((dia >= 01) && (dia <= 20))

                //imprime no console

                {System.out.println("Mês: Janeiro. Data válida!");
                System.out.println("Signo: Capricónio");}

                else if ((dia>=21) && (dia<=31))

                //imprime no console

                {System.out.println("Mês: Janeiro. Data Válida");
                System.out.println("Signo: Aquário");}

                else

                //imprime no console se nenhuma condição for satisfeita

                {System.out.println("Data inválida!");}
            break;

            //segundo caso

            case 2:

                //imprime no console

                System.out.println("Ano bissexto? 1-SIM 2-NÃO");

                //armazena na variavel
                
                opcao = ent.nextInt();

                //abre condicional if
                
                if (opcao == 1) {

                    if ((dia >= 01) && (dia <= 19))

                    //imprime no console

                    {System.out.println("Mês: fevereiro. Data válida!");
                    System.out.println("Signo: Aquário");}

                    else if ((dia>=20) && (dia<=29))

                    //imprime no console

                    {System.out.println("Mês: Janeiro. Data Válida");
                    System.out.println("Signo: Peixes");}

                    else

                    //imprime no console se a condição n for satisfeita

                    {System.out.println("Data inválida");}
                }

                else if (opcao == 2) {

                    if ((dia >= 01) && (dia <= 19))

                    //imprime no console

                    {System.out.println("Mês: fevereiro. Data válida!");
                    System.out.println("Signo: Aquário");}

                    else if ((dia>=20) && (dia<=28))

                    //imprime no console

                    {System.out.println("Mês: Janeiro. Data Válida");
                    System.out.println("Signo: Peixes");}

                    else

                    //imprime no console se a condição nao for satisfeita

                    {System.out.println("Opção inválida!");}
                }
                break;

            
            case 3:
                if ((dia >= 01) && (dia <= 20))
                {System.out.println("Mês: Março. Data válida!");
                System.out.println("Signo: Peixes");}
                else if ((dia>=21) && (dia<=31))
                {System.out.println("Mês: Março. Data Válida");
                System.out.println("Signo: Áries");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 4:
                if ((dia >= 01) && (dia <= 20))
                {System.out.println("Mês: Abril. Data válida!");
                System.out.println("Signo: Áries");}
                else if ((dia>=21) && (dia<=30))
                {System.out.println("Mês: Abril. Data Válida");
                System.out.println("Signo: Touro");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 5:
                if ((dia >= 01) && (dia <= 20))
                {System.out.println("Mês: Maio. Data válida!");
                System.out.println("Signo: Touro");}
                else if ((dia>=21) && (dia<=31))
                {System.out.println("Mês: Maio. Data Válida");
                System.out.println("Signo: Gêmeos");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 6:
                if ((dia >= 01) && (dia <= 20))
                {System.out.println("Mês: Junho. Data válida!");
                System.out.println("Signo: Gêmeos");}
                else if ((dia>=21) && (dia<=30))
                {System.out.println("Mês: Junho. Data Válida");
                System.out.println("Signo: Câncer");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 7:
                if ((dia >= 01) && (dia <= 21))
                {System.out.println("Mês: Julho. Data válida!");
                System.out.println("Signo: Câncer");}
                else if ((dia>=22) && (dia<=31))
                {System.out.println("Mês: Julho. Data Válida");
                System.out.println("Signo: Leão");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 8:
                if ((dia >= 01) && (dia <= 22))
                {System.out.println("Mês: Agosto. Data válida!");
                System.out.println("Signo: Leão");}
                else if ((dia>=23) && (dia<=31))
                {System.out.println("Mês: Agosto. Data Válida");
                System.out.println("Signo: Virgem");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 9:
                if ((dia >= 01) && (dia <= 22))
                {System.out.println("Mês: Setembro. Data válida!");
                System.out.println("Signo: Virgem");}
                else if ((dia>=23) && (dia<=30))
                {System.out.println("Mês: Setembro. Data Válida");
                System.out.println("Signo: Libra");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 10:
                if ((dia >= 01) && (dia <= 22))
                {System.out.println("Mês: Outubro. Data válida!");
                System.out.println("Signo: Libra");}
                else if ((dia>=23) && (dia<=31))
                {System.out.println("Mês: Outubro. Data Válida");
                System.out.println("Signo: Escorpião");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 11:
                if ((dia >= 01) && (dia <= 21))
                {System.out.println("Mês: Novembro. Data válida!");
                System.out.println("Signo: Escorpião");}
                else if ((dia>=22) && (dia<=30))
                {System.out.println("Mês: Novembro. Data Válida");
                System.out.println("Signo: Sagitário");}
                else
                {System.out.println("Data inválida!");}
                break;

            case 12:
                if ((dia >= 01) && (dia <= 21))
                {System.out.println("Mês: Dezembro. Data válida!");
                System.out.println("Signo: Sagitário");}
                else if ((dia>=22) && (dia<=31))
                {System.out.println("Mês: Dezembro. Data Válida");
                System.out.println("Signo: Capricórnio");}
                else
                {System.out.println("Data inválida!");}
                break;

            default:

            //imprime mensagem de erro no console

            {System.out.println("Data inválida");}

            }

            //incremento na variavel contadora

            cont++;
        }
    }
}