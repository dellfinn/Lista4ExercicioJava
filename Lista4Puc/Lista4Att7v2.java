package Lista4Puc;

import java.util.Scanner;

public class Lista4Att7v2 {
    public static void main(String[] args) {
        double altura, peso = 0;
        String sexo;

        Scanner ler = new Scanner(System.in);
        System.out.println("Seu Peso Ideal");
        System.out.println("informe sua altura: ");
        altura=ler.nextDouble();
        System.out.println("informe o seu sexo 'm' para masculino e 'f' para femenino ");
        sexo=ler.next();
        if(!sexo.equals("M")&&!sexo.equals("m")&& !sexo.equals("F")&&!sexo.equals("f")) {
            System.out.println("OPÇÃO INVALIDA");
        }else{
            switch(sexo){
                case"m":
                case"M":
                    peso=72.7*altura-58;
                case"f":
                case"F":
                    peso=62.1*altura-44;
            }
            System.out.println("O peso ideal é "+peso);
        }
    }
}
