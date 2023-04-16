//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente. 
import java.util.Scanner;

public class exercicio24{
    public static void main(String[] args){
        System.out.println("Digite 3 numeros, respectivamente:");
                Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
    
        if (n1 > n2 && n2 > n3) {
            System.out.println("A ordem crescente e: " +n3+ "," +n2+ "," +n1 );
        }
        else if (n2 > n1 && n1 > n3 ) {
            System.out.println("A ordem crescente e: " +n3+ "," +n1+ "," +n2 );
        } else if (n3>n1 && n1 >n2) {
            System.out.println("A ordem crescente e: " +n2+ "," +n1+ "," +n3 );
        }else if (n3>n2 && n2 >n1) {
            System.out.println("A ordem crescente e: " +n1+ "," +n2+ "," +n3 );
        }
        else if (n2>n1 && n3 >n1) {
            System.out.println("A ordem crescente e: " +n1+ "," +n3+ "," +n2 );
        }
    }
    }
