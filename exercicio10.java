//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 
import java.util.Scanner;

class exercicio10 {
    public static void main(String[] args){
        System.out.println("Digite um numero:");
        
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
            if (numero >= 0) {
	       System.out.println("POSITIVO");
        } else {
	       System.out.println("NEGATIVO");
          }
    }
}



