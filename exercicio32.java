import java.util.Scanner;

public class exercicio32{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a descrição do produto: ");
        String nomeProduto = input.nextLine();

        System.out.print("Informe a quantidade adquirida: ");
        int quantidade = input.nextInt();

        System.out.print("Informe o preço unitário: R$ ");
        double precoUnitario = input.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto = 0;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalPagar = total - desconto;

        System.out.println("\nDescrição do produto: " + nomeProduto);
        System.out.println("Quantidade adquirida: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

        input.close();
    }
}
