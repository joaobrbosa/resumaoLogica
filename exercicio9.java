//Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, 
//caso contrário escrever NÃO É MAIOR QUE 10! 
import java.util.Scanner;

class exercicio9 {
    public static void main(String[] args){
        System.out.println("Digite um numero aleatorio:");
        
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
            
        if (numero > 10) {
	       System.out.println("E MAIOR QUE 10 ! ! !");
        } else {
	       System.out.println("NAO E MAIOR QUE 10 ;( ");
          }
    }
}
