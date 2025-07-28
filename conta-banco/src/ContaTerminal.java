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



        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco. Sua agência é " + 
                           agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

    
    }
}
