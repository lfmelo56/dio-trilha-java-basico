import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome e sobrenome");
        String nome = scanner.nextLine();  // NextLine() pra evitar que envie a pergunta da agência e da conta de vez

        System.out.println("Digite o número da sua agência");
        String agencia = scanner.nextLine();  

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();  

        // Imprimindo dados obtidos pelo usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
