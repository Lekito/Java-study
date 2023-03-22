import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo Banco Confiança");
        System.out.println("Nome do títular da conta: ");
        String nome = sc.next();
        System.out.println("Número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();

        Conta cliente = new Conta(numConta, nome, saldo);

        cliente.consulta();

        System.out.println(" O que você deseja fazer?");
        System.out.println("Opção -> 1 Depósito");
        System.out.println("Opção -> 2 Saque");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Valor do depósito: R$ ");
                double valorDep = sc.nextDouble();
                cliente.deposito(valorDep);
                System.out.println("Atualização da sua conta ");
                cliente.consulta();
                break;
            case 2:
                System.out.println("Valor do saque: R$ ");
                double valorSaq = sc.nextDouble();
                cliente.saque(valorSaq);
                System.out.println("Atualização da sua conta ");
                cliente.consulta();
                break;
        }

        sc.close();
    }
}
