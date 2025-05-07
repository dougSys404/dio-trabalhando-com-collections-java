package exercises.map;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faca:
modelo = gol - consrmo = 14, 4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
 */


import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public class CarConsumption {


    public void getConsumption(){

        System.out.println(
                "Crie um dicinário que relacione os modelos e seus"
                + " respectivos consumos"

        );
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println();
        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println();
        System.out.println(
                "Confira se o modelo Tucson está no dicionário: "
                + carrosPopulares.containsKey("Tucson")
        );
        System.out.println(
                "Confira se o modelo Uno está no dicionário: "
                        + carrosPopulares.containsKey("Uno")
        );

        System.out.println();
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));

        //System.out.println();
        //System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println();
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos.toString());

        System.out.println();
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos.toString());

        System.out.println();
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double melhorConsumo =  Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMelhorConsumo = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(melhorConsumo)) {
                modeloMelhorConsumo = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMelhorConsumo + " - " + melhorConsumo);
            }
        }

        System.out.println();
        System.out.println("Exiba o modelo MENOS econômico e seu consumo: ");
        Double consumoMenosEficiente =  Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println();

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);


        System.out.println();
        System.out.println("Exiba a média dos consumos deste dicionánio de carros: ");
        System.out.println(soma/carrosPopulares.size());

        System.out.println();
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        System.out.println("Ante remoção: " + carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println("Pós remoção: " + carrosPopulares);

        System.out.println();
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println();
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println();
        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println();
        System.out.println("Confira se a lista está vazia: " + carrosPopulares.isEmpty());



    }

}
