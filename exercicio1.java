//Faça uma algoritmo que calcule o perímetro do triângulo. 
//O programa deve receber 3 números inteiros como parâmetro e deve retornar o valor do perímetro.

import java.util.Scanner;
class exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite o valor dos tres lados do triangulo, respectivamente: ");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int perimetro;
         perimetro = n1 + n2 + n3;
         System.out.println("O perimetro do triangulo e:" +perimetro+ "cm" );
   }
}
