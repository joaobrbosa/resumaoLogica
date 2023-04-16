//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. 
//Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). 
//Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', 
//senão escrever a mensagem 'Saldo Negativo'. 
import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        double saldo, debito, credito, saldoAtual;
        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.print("Digite o saldo atual: R$");
        saldo = scanner.nextDouble();
        System.out.print("Digite o débito: R$");
        debito = scanner.nextDouble();
        System.out.print("Digite o crédito: R$");
        credito = scanner.nextDouble();
        saldoAtual = saldo - debito + credito;
        System.out.printf("Saldo atual da conta %d: R$%.2f\n", numeroConta, saldoAtual);
        if (saldoAtual >= 0.0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
            }
}
