package exercises.map;

import java.util.*;

public class DesafioDado {
    public void desafioDado() {
        Random random = new Random();
        Map<Integer, Integer> lancamentos = new HashMap<>();

        // Inicializa os valores de 1 a 6 com 0
        for (int i = 1; i <= 6; i++) {
            lancamentos.put(i, 0);
        }

        // Lança o dado 100 vezes
        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(6) + 1;
            lancamentos.put(valor, lancamentos.get(valor) + 1);
        }

        // Mostra resultados
        System.out.println("Resultado dos lançamentos:");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.println("Valor " + entry.getKey() + " foi sorteado " + entry.getValue() + " vezes.");
        }
    }
}
