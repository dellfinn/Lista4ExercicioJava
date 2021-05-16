package Lista4Puc;

import java.util.Scanner;
public class Lista4Att9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in= new Scanner(System.in);
        double vol1, r1, h1, vol2, r2, h2, vol3, r3, a1, a2, a3;

        System.out.println("Raio do cone reto");
        r1 = in.nextDouble();
        System.out.println("Altura do cone");
        h1 = in.nextDouble();
        System.out.println("Raio do cilindro");
        r2 = in.nextInt();
        System.out.println("Altura do cilindro");
        h2 = in.nextInt();
        System.out.println("Raio da esfera");
        r3 = in.nextInt();


        vol1 = (Math.PI *Math.pow(r1, 2) *h1)/3;
        a1 = Math.PI *r1 *(Math.pow(r1, 2) + Math.pow(h1, 2));
        System.out.println("Volume do cone reto: " +vol1);
        System.out.println("Área do cone reto: "+a1);

        vol2 = Math.PI *Math.pow(r2, 2) *h2;
        a2 = 2 *Math.PI *r2 *h2;
        System.out.println("Volume do cilindro: "+vol2);
        System.out.println("Área do cilindro: "+a2);

        vol3 = 4./3 *Math.PI *Math.pow(r3, 3);
        a3 = 4 *Math.PI *Math.pow(r3, 2);
        System.out.println("Volume da esfera: "+vol3);
        System.out.println("Área da esfera: "+a3);


    }

}