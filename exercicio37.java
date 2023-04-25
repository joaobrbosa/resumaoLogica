//Acrescentar uma mensagem de 'VALOR INVÁLIDO ' no exercício [35] caso o segundo valor informado seja ZERO. 
import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = input.nextDouble();

        while (valor2 == 0) {
            System.out.print("VALOR INVÁLIDO. Digite o segundo valor novamente: ");
            valor2 = input.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.printf("%.2f / %.2f = %.2f\n", valor1, valor2, resultado);

        input.close();
    }
}
