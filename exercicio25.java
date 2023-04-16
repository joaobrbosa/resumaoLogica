//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. 
//OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args){
        System.out.println("Digite 3 numeros, respectivamente:");
                Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int soma1;
        int soma2;
        int soma3;
        
        soma1 = A + B;
        soma2 = A + C;
        soma3 = B + C;
           
        if (A<soma3 && B<soma2 && C<soma1) {
            System.out.println("Os valores podem formar um triangulo." );
        }
        else  {
            System.out.println("Os valores nao podem formar um triangulo." );
        } 
    }
    }
