//Ler um valor e escrever se é positivo, negativo ou zero. ********refazer
import java.util.Scanner;
class exercicio21 {
    public static void main(String[] args) {
       System.out.println("Digite um numero aleatorio : ");
       Scanner scan = new Scanner(System.in);
       int   valor = scan.nextInt();
                    if  (valor < 0) {
               System.out.println ("Valor NEGATIVO ");
               
           } else if (valor > 0) {
               System.out.println ("Valor POSITIVO ");
           } else {
               System.out.println ("ZERO");
           }
           }
    }

