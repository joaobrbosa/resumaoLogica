//Ler as notas da 1a e 2a avaliações de um aluno. Calcular a média aritmética simples e escrever uma 
//mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
//Escrever também a media calculada. 
import java.util.Scanner;
class exercicio12 {
    public static void main(String[] args){
        System.out.println("Digite as 3 notas do aluno:");
        
        Scanner scan = new Scanner(System.in);
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float media;
                
        media = (nota1 + nota2 )/ 2;
        if (media >= 6) {
	       System.out.println("Aluno APROVADO. Media:" +media);
        } else {
	       System.out.println("Aluno REPROVADO. Media:" +media);
          }
    }
}

