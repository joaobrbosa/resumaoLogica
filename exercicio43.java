//Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100. 

public class exercicio43 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 101;

        while (contador < 10) {
            System.out.println(numero);
            numero++;
            contador++;
        }
    }
}
