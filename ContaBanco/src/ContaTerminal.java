import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo, por favor insira seu nome");
        String nomeCliente = "Pedro";

        System.out.println("Por favor, insira sua Agência");
        String agencia = "122033";

        System.out.println("Por favor, insira seu número");
        int numero = 1202;

        System.out.println("Por favor, insira seu saldo");
        double saldo = 2800.89;


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
