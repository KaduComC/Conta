import java.util.Scanner;;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Informe o número da conta: ");
        numero = read.nextInt();

        System.out.print("Informe o número da agencia: ");
        agencia = read.next();

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = read.next();

        System.out.print("Informe o saldo: ");
        saldo = read.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        read.close();
    }
}