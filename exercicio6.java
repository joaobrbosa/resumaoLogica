//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma 
//comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
//Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
// o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos:");
        int numCarrosVendidos = scanner.nextInt();

        System.out.println("Digite o valor total das vendas:");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Digite o salário fixo:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido:");
        double valorPorCarroVendido = scanner.nextDouble();

        double comissaoPorCarro = valorPorCarroVendido * numCarrosVendidos;
        double comissaoSobreVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoSobreVendas;

        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }
}
