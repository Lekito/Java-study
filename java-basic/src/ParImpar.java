import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        int cont = 0;

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            cont++;
        } while (cont < quantNumeros);

        System.out.println("Número de pares é: " + quantPares);
        System.out.println("Número de impares: " + quantImpares);

        sc.close();
    }
}