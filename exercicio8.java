//Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média final é:
import java.util.Scanner;

class exercicio8 {
    public static void main(String[] args){
        System.out.println("Digite as 3 notas do aluno:");
        
        Scanner scan = new Scanner(System.in);
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float media;
        
        media = (nota1*2 + nota2*3 + nota3*5 ) / 10;
             System.out.println("A media final do aluno eh:" +media);
        
    }
}
