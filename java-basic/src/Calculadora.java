/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Alex Lekito
 * @version 1.0
 * @since 18/03/2023
 */

public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public static void soma(int numeroUm, int numeroDois) {
        int resultado = numeroUm + numeroDois;

        System.out.println("A soma " + numeroUm + " + " + numeroDois + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println(" A subtracao " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação " + numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("A divisão " + numero1 + " / " + numero2 + " = " + resultado);
    }

}
