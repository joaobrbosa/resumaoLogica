//Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos. 

import java.util.Scanner;

public class exercicio54 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int soma = 0;

			for (int i = 1; i <= 10; i++) {
			    System.out.print("Digite o " + i + "° número: ");
			    int num = input.nextInt();
			    soma += num;
			}

			System.out.println("A soma total dos números é: " + soma);
		}
    }
}

