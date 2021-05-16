package Lista4Puc;

import java.util.Scanner;

public class Lista4Att2 {
    public static void main(String[] args) {//METODO PRINCIPAL DO PROGRAMA
        int numero, n1, n2, n3, n4, aux, primeira, segunda, soma, calculo;//VARIAVEIS

        Scanner ler = new Scanner(System.in);//COMANDO DE ENTRADA PARA FAZER LEITURA DE UMA VARIAVEL

        System.out.println("Digite um numero de 4 algarismos: ");//TITULO  //
        numero = ler.nextInt();//LEITURA DA VARIAVEL
        n1 = numero / 1000;//formula
        aux = numero % 1000;//formula
        n2 = aux / 100;//formula
        aux = aux % 100;//formula
        n3 = aux / 10;//formula
        n4 = aux % 10;//formula

        primeira = (n1 * 10 ) + n2;//formula
        segunda = (n3 * 10 ) + n4;//formula
        soma = primeira + segunda;//formula
        calculo = (int) Math.pow(soma,2);//formula
        if (calculo == numero){
            System.out.println("O NUMERO POSSUI TAL CARACTERISTICA\n");//Saída de  mensagem para o usuario
        }

        else {
            System.out.println("O NUMERO NAO POSSUI TAL CARACTERISTICA\n");//Saída de  mensagem para o usuario
        }
    }
}
