import java.util.Scanner;

public class ExBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome: ");
            nome = sc.next();
            if (nome.equals("0"))
                break;

            System.out.println("Idade: ");
            idade = sc.nextInt();

            System.out.println("Sou " + nome + " e tenho " + idade + " anos.");
        }

        System.out.println("Continua aqui...");

        sc.close();
    }
}
