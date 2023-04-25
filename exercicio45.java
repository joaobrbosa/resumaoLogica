//Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. 
//Caso o valor informado (para N) não seja maior que 0, deverá ser lido um novo valor para N. 
import java.util.Scanner;

public class exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.print("Digite um valor: ");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
