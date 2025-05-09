package exercises.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamApiExercise {


    public void streamApiExercise(){
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println();
        System.out.println("Imprima todos os elementos dessa lista de String: ");
            // usando a stream API
            /*numerosAleatorios.stream().forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });*/

            // list sem usar o stream, mas usando lambda
            //numerosAleatorios.forEach( s -> System.out.println(s));

            //usando reference method
            //numerosAleatorios.forEach(System.out::println);

            // usando lambda
            numerosAleatorios.stream().forEach( s -> System.out.println(s));

        System.out.println();
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        // usando a stream API com reference method
        System.out.println("Somente 4 números serão impressoes pois o SET não aceita repetições");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        /*numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(numerosAleatorios5Primeiros);*/

        System.out.println();
        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> integers = numerosAleatorios.stream()
                        .map(Integer::parseInt).toList();

        integers.forEach(System.out::println);

        System.out.println();
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        // sem lambda
        /*List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if (integer % 2 == 0 && integer > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());*/

        // com lambda
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer %2 == 0 && integer > 2)
                .collect(Collectors.toList());

        System.out.println(listParesMaiorQue2);

        System.out.println();
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt)
                        .average().ifPresent(value -> System.out.println(value));

        System.out.println();
        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(numero -> numero %2 != 0);

        System.out.println(numerosAleatoriosInteger);


//        Para você
//        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//        numerosAleatoriosInteger.stream()
//                .skip(3)
//                .forEach(System.out::println);
//
//        long countNumerosUnicos = numerosAleatoriosInteger.stream()
//                .distinct()
//                .count();
//        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
//
//        System.out.print("Mostre o menor valor da lista: ");
//        numerosAleatoriosInteger.stream()
//                .mapToInt(Integer::intValue)
//                .min()
//                .ifPresent(System.out::println);
//
//        System.out.print("Mostre o maior valor da lista: ");
//        numerosAleatoriosInteger.stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .ifPresent(System.out::println);;
//
//        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
//                .filter(i -> (i % 2 == 0))
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);
//
//        System.out.println("Mostre a lista na ordem númerica: ");
//        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList());
//        System.out.println(numerosOrdemNatural);
//
//        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
////        dica: collect(Collectors.groupingBy(new Function())
//        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
//                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
//        System.out.println(collectNumerosMultiplosDe3E5);
    }
    }

