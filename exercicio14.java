//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
import java.util.Scanner;

class exercicio14 {
    public static void main(String[] args){
        System.out.println("Digite 2 numeros, respectivamente:");
        
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
           
        if (n1 > n2 ) {
            System.out.println("O maior numero e o:" + n1);
        }
        else {
            System.out.println("O maior numero e o:" + n2 );
                }
    }
    }
