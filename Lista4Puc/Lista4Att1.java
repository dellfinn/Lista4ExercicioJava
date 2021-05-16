package Lista4Puc;



import java.util.Scanner;//COMANDO DE ENTRADA DE VALORES

public class Lista4Att1 {
    public static void main(String[] args) { //METODO PRINCIPAL

        int numero;// VARIAVEL INTEIRA

        Scanner ler = new Scanner(System.in);//COMANDO PARA RECEBER ENTRADA DE VALORES

        System.out.println("Insira o numero para verificar se ele é divisivel por 5 e por 3: ");//TITULO DO PROGRAMA
        numero= ler.nextInt();// A VARIAVEL QUE RECEBERA A ENTRADA DE UM VALOR
        // TESTE DE ENTRADA VALOR 15

        if ((numero%5==0)&&(numero%3)==0){//SE RESTO DE 5 FOR = 0 E RESTO DE 3 FOR = 0 ESCREVA
            System.out.println("O numero é divisivel");//COMANDO PARA ESCREVER SE O NUMERO É DIVISIVEL
        //TESTE DE ENTRADA: RESULTADO O NUMERO É DIVISIVEL
        }else{
            System.out.println("O numero não é divisivel");//COMANDO PARA ESCREVER SE O NUMERO NÃO É DIVISIVEL
        }

    }
}
