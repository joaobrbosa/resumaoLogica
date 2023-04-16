//Ler 3 valores (considere que não serão informados valores iguais)  e escrever o maior deles.
import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args){
        System.out.println("Digite 3 numeros, respectivamente:");
                Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
    
        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior numero e o:" + n1);
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior numero e o:" + n2 );
        } else {
            System.out.println("O maior numero e o:" + n3 );
        }
    }
    }
