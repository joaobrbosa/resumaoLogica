import java.util.Scanner;

public class exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = 0;
        if (valor1 < valor2) {
            for (int i = valor1; i <= valor2; i++) {
                soma += i;
            }
        } else {
            for (int i = valor2; i <= valor1; i++) {
                soma += i;
            }
        }

        System.out.println("A soma dos inteiros entre " + valor1 + " e " + valor2 + " é: " + soma);

         }
}

