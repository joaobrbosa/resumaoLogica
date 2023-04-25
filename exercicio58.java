 //Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive). 
public class exercicio58 {
    public static void main(String[] args) {
        int soma = 0;
        int quantidade = 0;

        for (int i = 15; i <= 100; i++) {
            soma += i;
            quantidade++;
        }
        double media = (double) soma / quantidade;
        System.out.println("A média aritmética dos números inteiros entre 15 e 100 é: " + media);
    }
}
