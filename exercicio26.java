//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
//Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. 
import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args){
        System.out.println("Digite o nome dos times: ");

        System.out.println("Digite a quantidade de gols de cada time, respectivamente: ");
            Scanner scan = new Scanner(System.in);
             
        String time1 = scan.nextLine();
        String time2 = scan.nextLine();
        
        int gols1 = scan.nextInt();
        int gols2 = scan.nextInt(); 
                 
        if (gols1 > gols2) {
            System.out.println("O time vencedor e: "+time1 );
        }
        else if(gols2>gols1) {
            System.out.println("O time vencedor e: "+time2 );
        } else{
            System.out.println("Houve um Empate");
        }
    }
    }
