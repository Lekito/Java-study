import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        for (int cont = 0; cont < consoantes.length; cont++) {
            System.out.println("Letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[quantidadeConsoantes] = letra;
                quantidadeConsoantes++;
            }
        }

        System.out.println("Quantidade de consoantes : " + quantidadeConsoantes);
        System.out.println("As consoantes são: ");
        for (int i = 0; i < quantidadeConsoantes; i++) {
            System.out.print(consoantes[i] + " ");
        }

        sc.close();
    }
}
