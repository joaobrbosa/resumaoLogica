//Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos 
//(incluindo os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor lido. 
import java.util.Scanner;

public class exercicio56 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = 0;
        for (int i = valor1; i <= valor2; i++) {
            soma += i;
        }

        System.out.println("A soma dos inteiros entre " + valor1 + " e " + valor2 + " é: " + soma);

       
    }
}
