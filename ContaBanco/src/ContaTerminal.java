import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da agência.");
    int numAgencia = scanner.nextInt();

    System.out.println("Informe a agência");
    String agencia = scanner.next();

    System.out.println("Digite o seu nome");
    String nomeCliente = scanner.next();

    System.out.println("Deposite um valor para saldo");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque");
  }
}
