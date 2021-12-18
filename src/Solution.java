



import java.util.Random;
import java.util.Scanner;


public class Solution
{
    public static void main(String[] args)
    {
        // 1. Crea una matriu d'enters de 10x10 i omple-la amb números aleatoris. Després demana un número per teclat i busca si apareix a la matriu.

        
        int contador=0, i=0, j=0;
        int matriu[][] = new int[10][10];
        Scanner teclat = new Scanner (System.in);
        System.out.println("introdueix un nombre del 0 al 9");
        int n1 = teclat.nextInt();
        teclat.close();
        System.out.println();

        //Generem la matriu i al mateix temps comptem quants cops apareix l'element buscat
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                matriu[i][j] = (int)(Math.random()*10);
                System.out.print(" "+ matriu[i][j]+" ");
                if(matriu[i][j] == n1){
                    contador++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("el numero "+n1+" apareix "+contador+" vegades");


        //Bucle per trobar un element a una matriu
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if(matriu[i][j] == n1) {
                    System.out.print("\nPrimera aparició de "+n1+": matriu["+i+"]["+j+"]");
                    break;
                }
            }
            if(matriu[i][j] == n1) break;
        }
    }
}
