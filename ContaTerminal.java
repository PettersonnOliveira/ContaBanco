package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       /* int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        Double saldo = 237.48; */


        Scanner scanner = new Scanner(System.in);
        System.out.println("\"Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("\"Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("\"Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("\"Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
