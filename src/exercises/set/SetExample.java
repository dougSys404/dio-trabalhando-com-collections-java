package exercises.set;

import java.util.*;

public class SetExample {

    public void getSetExample(){
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/
        System.out.println();
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Não ficou na ordem inserida e elementos duplicados inseridos so uma vez");
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("Interface Set não tem um método do tipo indexOf, não e possível buscar a posição");

        System.out.println();
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("Não é possível trabalhar com posição no Set");

        System.out.println();
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        System.out.println("Não é possível substituir elementos em um Set");

        System.out.println();
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println();
        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("Interface Set não tem um método do tipo indexOf, não e possível buscar a posição");

        System.out.println();
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Como o set é uma Collection, é possível usar a interface Collections e o método min");

        System.out.println();
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Como o set é uma Collection, é possível usar a interface Collections e o método max");

        System.out.println();
        System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        System.out.println("É necessário usar o iterator para fazer a soma dos valores");

        System.out.println();
        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));
        System.out.println("Foi reaproveitada variável soma usada acima.");

        System.out.println();
        System.out.println("Remova a nota 0: ");
        System.out.println("Ante remoção...");
        System.out.println(notas.toString());
        notas.remove(0d);
        System.out.println("Verificando se a nota foi removida....");
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Remova a nota da posição 0");
        System.out.println("Interface Set não tem um método do tipo indexOf, não e possível buscar a posição");

        System.out.println();
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        System.out.println("Ante remoção...");
        System.out.println(notas.toString());
        Iterator<Double> iterator1 =  notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }
        System.out.println("Verificando se as notas foram removidas....");
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
            notas2.add(7d);
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas2.add(0d);
            notas2.add(3.6);
            /*também pode ser:
            notas.addAll(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);*/
        System.out.println(notas2.toString());
        System.out.println("Set com HashSet não armazena os elementos na ordem inserida, somente LinkedHashSet faz isso");

        System.out.println();
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3.toString());
        System.out.println("Devemos usar TreeSet aqui, pois ela organiza de acordo com a ordem natural dos elementos");

        System.out.println();
        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());

        System.out.println();
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());

        System.out.println();
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}
