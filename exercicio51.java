//Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] 
//(incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo. 
import java.util.Scanner;

public class exercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dentro = 0, fora = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Valores dentro do intervalo [10, 20]: " + dentro);
        System.out.println("Valores fora do intervalo [10, 20]: " + fora);

       
    }
}
