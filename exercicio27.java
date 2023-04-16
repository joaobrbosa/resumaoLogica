//Ler dois valores e imprimir uma das três mensagens a seguir: 
//‘Números iguais’, caso os números sejam iguais.
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
//‘Segundo maior’, caso o segundo seja maior que o primeiro.

import java.util.Scanner;
public class exercicio27 {
    public static void main(String[] args){
        System.out.println("Digite 2 numeros, respectivamente:");
                Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
            
        if (n1 > n2 ) {
            System.out.println("O PRIMEIRO E O MAIOR");
        }
        else if (n2 > n1 ) {
            System.out.println("O SEGUNDO E O MAIOR" );
        } else {
            System.out.println("OS NUMEROS SAO IGUAIS");
        }
    }
    }

