import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double n2 = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double n3 = input.nextDouble();

        System.out.print("Informe a média dos exercícios: ");
        double mediaExercicios = input.nextDouble();

        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 6;

        System.out.printf("\nMédia de Aproveitamento: %.2f\n", mediaAproveitamento);

        if (mediaAproveitamento >= 9.0) {
            System.out.println("A");
        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            System.out.println("B");
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        input.close();
    }
}


