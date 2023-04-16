//Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou 
//não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). 
import java.util.Scanner;

class exercicio13 {
    public static void main(String[] args){
        System.out.println("Digite o ano do seu nascimento e o ano em que se encontra atualmente, respectivamente:");
        
        Scanner scan = new Scanner(System.in);
        float anoNascimento = scan.nextFloat();
        float anoAtual = scan.nextFloat();
        float diferenca;
        
        diferenca = anoAtual - anoNascimento;
        if (diferenca >= 18) {
	       System.out.println("PODE votar este ano.");
        } else {
	       System.out.println("NAO PODE votar este ano." );
          }
    }
}
