//Escreva um algoritmo para ler as notas da 1a e 2a avaliações de um aluno, 
//calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos 
//durante a leitura (0 a 10) para cada nota. 
import java.util.Scanner;

public class exercicio39{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2;

        do {
            System.out.print("Digite a nota da 1ª avaliação: ");
            nota1 = input.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a nota da 2ª avaliação: ");
            nota2 = input.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média do aluno é: %.2f", media);

        input.close();
    }
}

