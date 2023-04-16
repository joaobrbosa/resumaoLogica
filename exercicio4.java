//Escreva um algoritmo que leia a idade de uma pessoa em anos e 
//apresente uma mensagem identificando se é maior ou menor de 18 anos.

import java.util.Scanner;
class exercicio4 {
    public static void main(String[] args){
        System.out.println("Digite sua idade:");
         Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
                  if (idade >= 18) {
	       System.out.println("Voce e maior de idade");
        } else {
	       System.out.println("Voce nao e maior de idade");
          }
    }
}
