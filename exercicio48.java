//Reescreva o exercício 50 utilizando a estrutura REPITA e um CONTADOR. 
import java.util.Scanner;

public class exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int i = 0;
        
        do {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            
            if (num < 0) {
                contador++;
            }
            
            i++;
        } while (i < 10);
        
        System.out.println("Quantidade de números negativos: " + contador);
        
    }
}
