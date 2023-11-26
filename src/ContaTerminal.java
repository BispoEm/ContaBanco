import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira numero da conta:");
        int numero = scanner.nextInt();

        System.out.println("Insira agencia da conta:");
        String agencia = scanner.next();

        System.out.println("Insira nome do cliente da conta:");
        String nomeCliente = scanner.next();
        
        System.out.println("Insira saldo da conta:");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("Olá "
        .concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia).concat(", conta ")
        .concat(""+numero).concat(" e seu saldo ")
        .concat(""+saldo)
        .concat(" já está disponível para saque."));
    }
}
