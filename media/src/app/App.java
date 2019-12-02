package app;
//Importando a biblioteca
import java.util.Scanner;
//Criando a classe 
public class App {
    //Método principal para calcular a media
        public static void main(String[] args) {
            //Reconhecimento de entradas
            Scanner ent = new Scanner (System.in);
            //Declarando variáveis
            float bim1, bim2, bim3, bim4, media;
            //Imprimindo no console
            System.out.println("Digite a nota do bimestre 1");
            //Armazenando o valor do bim1
            bim1=ent.nextFloat();
            //Imprimindo no console
            System.out.println("Digite a nota do bimestre 2");
            //Armazenando o valor do bim2
            bim2=ent.nextFloat();
            //Imprimindo no console
            System.out.println("Digite a nota do bimestre 3");
            //Armazenando o valor do bim3
            bim3=ent.nextFloat();
            //Imprimindo no console
            System.out.println("Digite a nota do bimestre 4");
            //Armazenando o valor do bim4
            bim4=ent.nextFloat();
            //Calculando a media
            media=(bim1+bim2+bim3+bim4)/4;
            //Imprime no console o resultado
            System.out.println("A média é: " + media);
        }
    }
