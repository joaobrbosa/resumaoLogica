//A jornada de trabalho semanal de um funcionário é de 40 horas. 
//O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora 
//regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
//o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
//e caso tenham sido trabalhadas. 
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasTrabalhadasPorMes;
        double salarioPorHora, salarioTotal;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadasPorMes = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        salarioPorHora = scanner.nextDouble();

        if (horasTrabalhadasPorMes <= 160) {
            salarioTotal = horasTrabalhadasPorMes * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadasPorMes - 160;
            double salarioHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (160 * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        salarioTotal *= 4;

        System.out.println("O salário total do funcionário é R$" + salarioTotal);

        scanner.close();
    }
}

