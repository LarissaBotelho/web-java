package app;
//Importando a biblioteca
import java.util.Scanner;

public class App {
    //Método principal para calcular a area e perimetro
    public static void main(String[] args) {
        //Reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //Declarando variáveis
        //lt é largura do terreno, ht é altura do terreno, 
        //hc é altura do imovel e lc é largura do imovel;
        float ht, lt, hc, lc, totalterreno, totalimovel, areaterreno, areaimovel;
        //MC é cada metro construido, MNC cada metro nao construido
        float MC=5, MNC=3.80f;
        //Imprimindo no console
        System.out.println("Digite a largura do terreno");
        //Armazenando o valor da largura do terreno
        lt=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Digite o comprimento do terreno");
        //Armazenando o valor do comprimento do terreno
        ht=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Digite o comprimento do imóvel");
        //Armazenando o valor do comprimento do imovel
        hc=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Digite a largura do imóvel");
        //Armazenando o valor da largura do imovel
        lc=ent.nextFloat();
        //Calculando a area do terreno
        areaterreno=(ht*lt);
        //Calculando a area do imovel
        areaimovel=(hc*lc);
        //Calcula o valor total no terreno e no imovel
        totalterreno= areaterreno/MNC;
        totalimovel= areaimovel/MC;
        //Calcula o total de imposto a ser pago
        float imposto= (totalimovel+totalterreno);
        //Imprime no console o resultado
        System.out.printf("O valor do imposto é R$ %.2f", imposto);
        
    }
}