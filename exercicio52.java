//Ler 10 valores, calcular e escrever a média aritmética desses valores lidos. 
import java.util.Scanner;

public class exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / n;

        System.out.println("A média aritmética dos valores lidos é: " + media);

        
    }
}

