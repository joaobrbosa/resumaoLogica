import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade (em Kg) de morangos: ");
        double qtdMorangos = sc.nextDouble();
        
        System.out.print("Quantidade (em Kg) de maçãs: ");
        double qtdMacas = sc.nextDouble();
        
        double precoMorangos = (qtdMorangos <= 5) ? 2.5 : 2.2;
        double precoMacas = (qtdMacas <= 5) ? 1.8 : 1.5;
        
        double totalCompra = (qtdMorangos * precoMorangos) + (qtdMacas * precoMacas);
        
        if (qtdMorangos + qtdMacas > 8 || totalCompra > 25) {
            totalCompra *= 0.9;
        }
        
        System.out.printf("Valor total a ser pago: R$ %.2f", totalCompra);
        
        sc.close();
    }
}
