package exercises.map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionPopulation {


    public void getPopulation(){

        // 1. Criar dicionário com estados e populações
        Map<String, Integer> populacaoEstados = new LinkedHashMap<>();
        populacaoEstados.put("PE", 9616621);
        populacaoEstados.put("AL", 3351543);
        populacaoEstados.put("CE", 9187103);
        populacaoEstados.put("RN", 3534265);

        // 2. Substituir população de RN
        populacaoEstados.put("RN", 3534165);

        // 3. Verificar se PB está no dicionário, senão, adicionar
        if (!populacaoEstados.containsKey("PB")) {
            populacaoEstados.put("PB", 4039277);
        }

        // 4. Exibir população de PE
        System.out.println("População de PE: " + populacaoEstados.get("PE"));

        // 5. Exibir todos na ordem de inserção
        System.out.println("\nEstados na ordem de inserção:");
        for (Map.Entry<String, Integer> entry : populacaoEstados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 6. Exibir em ordem alfabética
        System.out.println("\nEstados em ordem alfabética:");
        Map<String, Integer> estadosOrdenados = new TreeMap<>(populacaoEstados);
        for (Map.Entry<String, Integer> entry : estadosOrdenados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 7. Estado com menor população
        String estadoMenor = Collections.min(populacaoEstados.entrySet(), Map.Entry.comparingByValue()).getKey();
        int menorPop = populacaoEstados.get(estadoMenor);
        System.out.println("\nEstado com menor população: " + estadoMenor + " - " + menorPop);

        // 8. Estado com maior população
        String estadoMaior = Collections.max(populacaoEstados.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maiorPop = populacaoEstados.get(estadoMaior);
        System.out.println("Estado com maior população: " + estadoMaior + " - " + maiorPop);

        // 9. Soma da população
        int soma = 0;
        for (int pop : populacaoEstados.values()) {
            soma += pop;
        }
        System.out.println("\nSoma da população: " + soma);

        // 10. Média da população
        double media = (double) soma / populacaoEstados.size();
        System.out.println("Média da população: " + media);

        // 11. Remover estados com população < 4.000.000
        populacaoEstados.entrySet().removeIf(entry -> entry.getValue() < 4000000);
        System.out.println("\nEstados com população >= 4.000.000: " + populacaoEstados);

        // 12. Apagar o dicionário
        populacaoEstados.clear();

        // 13. Verificar se está vazio
        System.out.println("\nDicionário está vazio? " + populacaoEstados.isEmpty());
    }

}
