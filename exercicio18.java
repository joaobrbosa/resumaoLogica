//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
//Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre 
//o que ultrapassar este valor, calcular e escrever o seu salário total. 
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioFixo, valorVendas, comissao, salarioTotal;
        System.out.print("Digite o salário fixo do vendedor: R$");
        salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas efetuadas: R$");
        valorVendas = scanner.nextDouble();

        if (valorVendas <= 1500.0) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (1500.0 * 0.03) + ((valorVendas - 1500.0) * 0.05);
        }

        salarioTotal = salarioFixo + comissao;
        System.out.printf("O salário total do vendedor é R$%.2f\n", salarioTotal);
        }
}

