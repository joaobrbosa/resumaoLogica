//Faça um algoritmo para ler um número que é um código de usuário. 
//Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) 
//deve ser apresentada a mensagem ‘Usuário inválido!’. 
//Caso o Código seja correto, deve ser apresentado outro valor que é a senha. 
//Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 
//Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.

import java.util.Scanner;

public class exercicios31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o código do usuário: ");
        int codigo = scan.nextInt();
        
        if (codigo != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scan.nextInt();
            
            if (senha != 9999) {
                System.out.println("Senha Incorreta.");
            } else {
                System.out.println("Acesso Permitido.");
            }
        }
        
       
    }
}

