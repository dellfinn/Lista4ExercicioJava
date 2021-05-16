package Lista4Puc;

import java.util.Scanner;

public class Lista4Att6 {
    public static void main(String[] args) {
        int ano;

        Scanner ler = new Scanner(System.in);
        System.out.println("Descubra se o ano é bissexto");
        System.out.print("Insira o ano para verificar se é bissexto");
        ano = ler.nextInt();
        if (((ano % 4 == 0) && (ano % 100 != 0)) || ano % 400 == 0)
            System.out.println("o ano é um ano bissexto");
        else
            System.out.println("o ano não é um ano bissexto");
    }
}
