//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
//distribuidor e dos impostos (aplicados ao custo de fábrica).Supondo que o percentual do distribuidor 
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
//calcular e escrever o custo final ao consumidor. 

import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;
        double custoFinal = custoFabrica * (1 + percentualDistribuidor + percentualImpostos);
        System.out.println("O custo final ao consumidor é: " + custoFinal);
    }
}
