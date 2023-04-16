//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres 
//(considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). 
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
//e o produto das idades do homem mais novo com a mulher mais velha. 
import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args){
        System.out.println("Digite a idade dos dois homens e das duas mulheres: ");
        
         Scanner scan = new Scanner(System.in);

         int idadeH1 = scan.nextInt();
         int idadeH2 = scan.nextInt();
         int idadeM1 = scan.nextInt();
         int idadeM2 = scan.nextInt();
         int soma=0;
         int produto=0;
         
         if (idadeH1>idadeH2 && idadeM1>idadeM2){
             soma = idadeH1+idadeM2;
             produto = idadeH2*idadeM1;
             
         }else if (idadeH1<idadeH2 && idadeM1<idadeM2){
             soma = idadeH2 + idadeM1;
             produto = idadeH1 * idadeM2;
         }else if (idadeH1<idadeH2 && idadeM1>idadeM2){
             soma = idadeH2 + idadeM2;
             produto = idadeH1 * idadeM1;
         }else if (idadeH1>idadeH2 && idadeM1<idadeM2){
             soma = idadeH1 + idadeM2;
             produto = idadeH2 * idadeM1;
         System.out.println("A soma e o produto das idades sao: " +soma+ " e " +produto);
         }
         
        }
             }
