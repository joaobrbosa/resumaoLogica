import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número do empregado: ");
        int codigo = input.nextInt();

        System.out.print("Informe o ano de nascimento do empregado: ");
        int anoNascimento = input.nextInt();

        System.out.print("Informe o ano de ingresso na empresa do empregado: ");
        int anoIngresso = input.nextInt();

        int idade = 2023 - anoNascimento;
        int tempoTrabalho = 2023 - anoIngresso;

        System.out.printf("\nIdade: %d\nTempo de trabalho: %d\n", idade, tempoTrabalho);

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        input.close();
    }
}
