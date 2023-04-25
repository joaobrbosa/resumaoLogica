//Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10). 
public class exercicio46{
    public static void main(String[] args) {
        int numero = 8;
        
        for(int i=1; i<=10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
