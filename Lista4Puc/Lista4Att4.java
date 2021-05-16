package Lista4Puc;

import java.util.Scanner;

public class Lista4Att4 {
    public static void main(String[] args) {//metodo principL
        int numero, verificaint;//VARIAVEIS INTEIRAS
        float verificar, intoufloat;//VARIAVEIS
        Scanner ler = new Scanner(System.in);//COMANDO PARA RECEBER ENTRADA DE UM VALOR

        System.out.println("Digite o valor para verificar se é um quadrado perfeito: ");//TITULO
        numero=ler.nextInt();
        verificar = (float) Math.sqrt(numero);
        verificaint = (int) verificar;
        intoufloat = verificar - verificaint;

        if (intoufloat == 0){
            System.out.println("E QUADRADO PERFEITO");//SAIDA
        }

        else {
            System.out.println("NAO E QUADRADO PERFEITO");//SAIDA
        }

    }
}
