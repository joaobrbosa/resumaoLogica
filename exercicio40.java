//Acrescente uma mensagem 'NOVO CÁLCULO (S/N)? ' ao final do exercício [39]. 
//Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo. 
import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args){
        System.out.println("Digite as 2 notas do aluno: ");
        
        Scanner scan = new Scanner(System.in);
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float media;
        double valor;
        
        double litros = scan.nextDouble();

        char tipo = scan.next().charAt(0);

        
        
        media = (nota1 + nota2 )/ 2;
          System.out.println("Media do Aluno:" +media);
                    
        System.out.println("Novo Calculo ?");
        
       switch (tipo){
            case 'S':
                valor = litros * 3.30;
                System.out.println("O valor a ser pago e: "+valor );
                break;
                
            case 'N':
                valor = litros * 2.90;
                System.out.println("O valor a ser pago e: "+valor );
                break;

       }
    }
}
