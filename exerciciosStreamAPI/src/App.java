import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
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
                System.out.println(numerosAleatorios);
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

                System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
                /*
                 * List<Integer> listaParesMaiores2 = numerosAleatorios.stream()
                 * .map(Integer::parseInt)
                 * .filter(new Predicate<Integer>() {
                 * public boolean test(Integer number) {
                 * if (number % 2 == 0 && number > 2)
                 * return true;
                 * return false;
                 * }
                 * }).collect(Collectors.toList());
                 */
                System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
                List<Integer> listaParesMaiores2 = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .filter(number -> number % 2 == 0 && number > 2)
                                .collect(Collectors.toList());

                System.out.println(listaParesMaiores2);

                System.out.println("Mostre a média dos números: ");
                /*
                 * 
                 * numerosAleatorios.stream()
                 * .mapToInt(new ToIntFunction<String>() {
                 * public int applyAsInt(String s) {
                 * return Integer.parseInt(s);
                 * }
                 * });
                 */

                /*
                 * numerosAleatorios.stream()
                 * .mapToInt(s -> Integer.parseInt(s))
                 * .average()
                 * .ifPresent(new DoubleConsumer() {
                 * public void accept(double v) {
                 * System.out.println(v);
                 * }
                 * });
                 */

                numerosAleatorios.stream()
                                .mapToInt(s -> Integer.parseInt(s))
                                .average()
                                .ifPresent(v -> System.out.println(v));

                System.out.println("Remova os valores ímpares: ");
                List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
                /*
                 * Esse metodo removeIf não é um stream, pois ele altera a lista.
                 * numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
                 * public boolean test(Integer v) {
                 * if (v % 2 != 0)
                 * return true;
                 * return false;
                 * }
                 * });
                 */
                numerosAleatoriosInteger.removeIf(integer -> integer % 2 == 0);
                System.out.println(numerosAleatoriosInteger);
        }
}
