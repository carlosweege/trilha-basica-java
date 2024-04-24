import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        double saldoConta;
        String agenciaConta = new String();
        String nomeCliente = new String();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da conta");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da agência!");
        agenciaConta = sc.next();
        System.out.println("Por favor, digite o saldo em conta!");
        saldoConta = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+ ", conta "+numeroConta+ "e seu saldo "+saldoConta+" já está disponível para saque.");

        sc.close();
    }
}
