import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do títular da conta: ");
        String nome = sc.next();
        System.out.println("Número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();

        Conta cliente = new Conta(numConta, nome, saldo);

        cliente.consulta();

        sc.close();
    }
}
