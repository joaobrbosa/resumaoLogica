//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. 
//Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 
import java.util.Scanner;
class exercicio11 {
    public static void main(String[] args){
        System.out.println("Quantas macas foram compradas: ");
            Scanner scan = new Scanner(System.in);
          int macas = scan.nextInt();
        double total ;
           if (macas >= 12) {
                total = macas * 1;
        } else {
	       total = macas * 1.30;
          }
          System.out.println("O custo total da compra foi de: R$"+total);
    }
}

