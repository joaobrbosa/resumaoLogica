//Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. 
import java.util.Scanner;
class exercicio50 {
    public static void main(String[] args) {
       System.out.println("Digite dez numeros aleatorios, respectivamente:");
       Scanner scan = new Scanner(System.in);
       int valor;
       int contador=0;
       int contadorNeg = 0;
       int contadorPos = 0;
       while (contador < 10){
           valor = scan.nextInt();
           if (valor <=0){
               contadorNeg++;
           }else {
               contadorPos++;
           }
           contador++;
       }System.out.println( contadorNeg+ " Numeros negativos");
    }
}
