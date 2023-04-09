import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");

        /*
         * Classe Anônima
         * 
         * numerosAleatorios.stream().forEach(new Consumer<String>() {
         * public void accept(String s) {
         * System.out.println(s);
         * }
         * });
         */

        // Lambda
        // numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // O forEach já tem o stream.
        // numerosAleatorios.forEach(s -> System.out.println(s));

        // Reference Method. Ambos os códigos acima comentados fazem a mesma coisa.
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");

        // Reference Method
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // O código acima é muito parecido com o de baixo. collectSet é uma variável.
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println(collectSet); // imprimi só testa a variável.
        System.out.println(collectSet.getClass()); // diz o tipo.

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        /*
         * 
         * numerosAleatorios.stream()
         * .map(new Function<String, Integer>() {
         * public Integer apply(String s) {
         * return Integer.parseInt(s);
         * }
         * });
         */
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(collectList.getClass());
        System.out.println(collectList);
    }
}
