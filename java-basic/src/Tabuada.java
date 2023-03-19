import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(cont + " x " + tabuada + " = " + cont * tabuada);
        }

        sc.close();
    }
}
