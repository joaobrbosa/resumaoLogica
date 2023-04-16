//Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e 
//escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):

import java.util.Scanner;

class exercicio7 {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura ( em Fahrenheit): ");
        
        Scanner scan = new Scanner(System.in);
        float temperaturaF = scan.nextFloat();
        
        float temperaturaC = ( (temperaturaF - 32 ) / 9 ) * 5;
        
        System.out.println("A temperatura aferida em Celsius eh :" +temperaturaC );

    }
}
