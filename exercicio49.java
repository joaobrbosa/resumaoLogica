//Reescreva o exercício 51 utilizando a estrutura ENQUANTO e um CONTADOR. 
import java.util.Scanner;

public class exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, dentroIntervalo = 0, foraIntervalo = 0, contador = 0;

        while (contador < 10) {
            System.out.print("Digite um valor: ");
            num = scanner.nextInt();

            if (num >= 10 && num <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }

            contador++;
        }

        System.out.printf("Valores dentro do intervalo: %d\n", dentroIntervalo);
        System.out.printf("Valores fora do intervalo: %d\n", foraIntervalo);

    }
}

