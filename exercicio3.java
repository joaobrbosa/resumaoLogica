//Escreva um algoritmo que permita fazer a conversão cambial entre reais e dólares. 
//Considere como taxa de cambio US$ 1,00 = R$ 4,05. Leia uma valor em reais pelo teclado e 
//mostre o correspondente em dólares.

import java.util.Scanner;

class exercicios3 {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade em reais que voce possui: ");
        Scanner scan = new Scanner(System.in);
        float real = scan.nextFloat();
        float dolar;
        dolar = real*4.05F;
         System.out.println("Voce possui no total :" +dolar+" dolares " );
      }
}

