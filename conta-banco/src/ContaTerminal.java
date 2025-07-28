import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner =  new Scanner(System.in);

        // nome do cliente
        System.out.println("Digite seu nome completo");
        String name = scanner.next();
        // número da conta
        System.out.println("Digite o número da conta");
        int conta = scanner.nextInt();
        // número da agência
        System.out.println("Digite o número da agência");
        String agencia = scanner.next();
        // saldo na conta
        System.out.println("Digite o saldo da conta");
        double saldo = scanner.nextDouble();



        System.out.println("Olá %/, obrigado por criar uma conta em nosso, banco, sua agência é %/, conta %/ e seu saldo %/ já está disponível para saque");

    
    }
}
