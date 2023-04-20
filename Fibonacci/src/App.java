import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite um número: " + sc.nextLine());

        int numero = sc.nextInt();
        int fibonacci[] = new int[numero + 2];
        fibonacci[0] = 0;

        int a = 1;
        int b = 0;
        int aux;

        for (int i = 0; i <= numero; i++) {
            // System.out.println(a);
            fibonacci[i + 1] = a;
            aux = a;
            a = a + b;
            b = aux;
        }

        System.out.println(Arrays.toString(fibonacci));

        System.out.println(numero + " pertence a fibonacci :" + (IntStream.of(fibonacci).anyMatch(x -> x == numero)));

        sc.close();
    }
}
