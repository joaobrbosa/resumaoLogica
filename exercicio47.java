//Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido. 
import java.util.Scanner;

public class exercicio47 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		do {
			System.out.print("Digite um número inteiro entre 1 e 10: ");
			n = scanner.nextInt();
		} while (n < 1 || n > 10);

		System.out.println("Tabuada do " + n + ":");
		for (int i = 1; i <= 10; i++) {
			int resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
		}

		
	}

}
