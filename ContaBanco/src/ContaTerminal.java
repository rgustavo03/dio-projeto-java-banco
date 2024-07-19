import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    // Criando a classe Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da agência."); // mensagem para usuario
    int numAgencia = scanner.nextInt(); // scanner obtem o valor

    System.out.println("Informe a agência"); // mensagem para usuario
    String agencia = scanner.next(); // scanner obtem o valor

    System.out.println("Digite o seu nome"); // mensagem para usuario
    String nomeCliente = scanner.next(); // scanner obtem o valor

    System.out.println("Deposite um valor para saldo"); // mensagem para usuario
    double saldo = scanner.nextDouble(); // scanner obtem o valor

    // Exibir a mensagem para o usuario sobre a criacao da conta
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque");
  }
}
