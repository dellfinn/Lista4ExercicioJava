package Lista4Puc;

import java.util.Scanner;

public class Lista4Att3 {
    public static void main(String[] args) {//METODO PRINCIPAL DO PROGRAMA
        float A,B,C;//LADOS DO TRIANGULO
        Scanner ler = new Scanner(System.in);//COMANDO PARA RECEBER ENTRADA DE UMA LEITURA DE VARIAVEIS

        System.out.println("descubra se é tringulo obtusângulo, retângulo ou acutângulo   ");//TITULO
        System.out.print("Informe o lado A do trângulo:");//LEITURA DO LADO A
        A = ler.nextFloat();
        System.out.print("Informe o lado B do trângulo:");//LEITURA DO LADO B
        B = ler.nextFloat();
        System.out.print("Informe o lado C do trângulo:");//LEITURA DO LADO C
        C = ler.nextFloat();
        if (Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)){//SE A^2=B^2+C^2 TRIANGULO RETANGULO
            System.out.print("TRIANGULO RETANGULO\n");
        }

        else if (Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)){//SE A^2>B^2+C^2 TRIANGULO OBTUSANGULO
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }

        else if (Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)){////SE A^2<B^2+C^2 TRIANGULO OBTUSANGULO
            System.out.print("TRIANGULO ACUTANGULO\n");
        }

    }
}
