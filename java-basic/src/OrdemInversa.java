public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };

        for (int cont = 0; cont <= vetor.length - 1; cont++) {
            System.out.print(vetor[cont] + " ");
        }
        System.out.println(" ");
        System.out.println("Vetor na ordem invertida: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}