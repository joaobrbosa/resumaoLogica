//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args){
        System.out.println("Digite 3 numeros, respectivamente:");
                Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int soma;
           if (n1 > n2 && n2 > n3) {
            soma = n1 + n2;
        }
        else if (n3 > n2 && n2 > n1) {
            soma = n2 + n3;
        } else {
            soma = n3 + n1;
        }
        System.out.println("A soma dos maiores e:" + soma);
    }
    }

