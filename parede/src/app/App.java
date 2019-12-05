package app;
import java.util.Scanner;

public class App {
    //Método principal para calcular a quantidade de azulejos
    public static void main(String[] args) {
        //Reconhecimento de entradas
        Scanner ent = new Scanner (System.in);
        //Declarando variáveis
        //lp é largura da parede, hp é altura da parede, 
        //ha é altura do azulejo e la é largura do azulejo;
        float lp, hp, ha, la, areaParede, areaAzulejo, QntAzulejo;
        //Imprimindo no console
        System.out.println("Digite a largura da parede");
        //Armazenando o valor da largura da parede
        lp=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Digite a altura da parede");
        //Armazenando o valor da altura da parede
        hp=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Digite a altura do azulejo");
        //Armazenando o valor da altura do azulejo
        ha=ent.nextFloat();
        //Imprimindo no console
        System.out.println("Digite a largura do azulejo");
        //Armazenando o valor da largura do azulejo
        la=ent.nextFloat();
        //Calculando a area da parede
        areaParede=(hp*lp);
        //Calculando a area do azulejo
        areaAzulejo=(ha*la);
        //Calcula qnt de azulejos
        QntAzulejo=(areaParede/areaAzulejo);
        //Imprime no console o resultado
        System.out.println("A medida da area da parede é: " + areaParede + "m2");
        System.out.println("A medida da area do azulejo é: " + areaAzulejo + "cm2");
        System.out.println("A quantidade de azulejos é: " + QntAzulejo + "cm");
    }
}