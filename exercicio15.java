//Ler dois valores (considere que não serão lidos valores iguais)  e escrevê-los em ordem crescente.
import java.util.Scanner;

class exercicio15 {
    public static void main(String[] args){
        System.out.println("Digite 2 numeros, respectivamente:");
        
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
         
        if (n1 > n2 ) {
            System.out.println("Os valores em ordem crescentes sao: " + n1 + " e " +n2 );
        }
        else if (n2 > n1 ) {
            System.out.println("Os valores em ordem crescentes sao: " + n2 + " e " +n1  );
        
        }
    }
    }
