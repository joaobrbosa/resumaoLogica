//Reescreva o exercício35 utilizando a estrutura ENQUANTO. 
import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextDouble();

        System.out.print("Digite o segundo valor (não pode ser zero): ");
        valor2 = input.nextDouble();

        while (valor2 == 0) {
            System.out.print("Valor inválido. Digite o segundo valor novamente: ");
            valor2 = input.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        input.close();
    }
}
