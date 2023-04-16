//Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, 
//ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado 
//da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA). 

import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextDouble();

        do {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = input.nextDouble();
        } while (valor2 == 0);

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        input.close();
    }
}
