//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e 
//calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o 
//jogo pode iniciar em um dia e terminar no dia seguinte. 
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();
        int duracao;
        if (horaFim <= horaInicio) {
            duracao = horaFim + 24 - horaInicio;
        } else {
            duracao = horaFim - horaInicio;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");

        scanner.close();
    }
}
