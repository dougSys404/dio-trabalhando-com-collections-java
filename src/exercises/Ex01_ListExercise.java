package exercises;

/*
*Dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5,, 7, 0, 3.6} faça
*
 */

import java.util.*;

public class Ex01_ListExercise {

    List<Double> notas = new ArrayList<Double>();

    public void showListExercise(){
        System.out.println("Crie uma lista e adicione as sete notas");
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println();
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5.0));
        System.out.println();
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println("Imprimindo novamente a lista: ");
        System.out.println(notas.toString());
        System.out.println();
        System.out.println("Substitua a nota 5.0 pela nota 7.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println();
        System.out.println("Imprimindo novamente a lista: ");
        System.out.println(notas.toString());
        System.out.println();
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
        System.out.println();
        System.out.println("Exiba todas as notas a ordem que as notas foram informadas:");
        for (Double nota: notas){
            System.out.println("[" + nota + "]");
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println();
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println();
        System.out.println("Exiba a soma dos valores: ");
        /*
        Itetator
        Permite percorrer uma coleção (notas), elemento por elemento,
        de forma segura e genérica, sem depender da estrutura interna
        (como índices de uma lista).
         */
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println();
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println();
        System.out.println("Remova a nota 0");
        notas.remove(0D);
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Remova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println();
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas.toString());
        System.out.println("Verificando se a lista está vázia: " + notas.isEmpty());
    }
}

