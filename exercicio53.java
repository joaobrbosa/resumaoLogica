import java.util.Scanner;

public class exercicio53{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número de alunos: ");
        int numAlunos = input.nextInt();
        
        double somaNotas = 0;
        
        for(int i=1; i<=numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = input.nextDouble();
            somaNotas += nota;
        }
        
        double media = somaNotas / numAlunos;
        
        System.out.println("A média da turma é: " + media);
        
        input.close();
    }
}
