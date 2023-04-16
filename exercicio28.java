//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível 
//(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente 
//sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args){
        System.out.println("Digite quantos litros de combustivel: ");
        System.out.println("Digite qual foi o tipo de combustivel: ");
        
         Scanner scan = new Scanner(System.in);

        double litros = scan.nextDouble();
        char tipo = scan.next().charAt(0);
        double valor;
        
        switch (tipo){
            case 'G':
                valor = litros * 3.30;
                System.out.println("O valor a ser pago e: "+valor );
                break;
                
            case 'A':
                valor = litros * 2.90;
                System.out.println("O valor a ser pago e: "+valor );
                break;
                
        }
             }
    }


