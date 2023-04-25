//Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. 
//Escreva o valor final da soma efetuada. 
import java.util.Scanner;

public class exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números menores que 40 é: " + soma);
        
    }
}

