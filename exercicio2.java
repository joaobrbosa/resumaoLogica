//Escreva uma algoritmo que receba uma hora no formato de três números inteiros que representam: 
//horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de segundos.
import java.util.Scanner;

class exercicio2 {
    public static void main(String[] args){
        System.out.println("Digite a hora, em horas, minutos e segundos , respectivamente:");
        Scanner scan = new Scanner(System.in);
        int horas = scan.nextInt();
        int segundos;
         segundos = horas * 3600;
         System.out.println( "O total de horas em segundos eh:" + segundos );
    }
}
