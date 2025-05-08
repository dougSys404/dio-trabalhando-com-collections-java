package exercises.set;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class Exercise01 {

    public void showRainbowColors(){

        System.out.println("Crie uma conjunto contendo as cores do arco-íris e exiba:");
        Set<String> rainbowColors = new HashSet<>();
        rainbowColors.add("VIOLETA");
        rainbowColors.add("ANIL");
        rainbowColors.add("AZUL");
        rainbowColors.add("VERDE");
        rainbowColors.add("AMARELO");
        rainbowColors.add("VERMELHO");
        System.out.println(rainbowColors.toString());

        System.out.println();
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra");
        for (String color : rainbowColors){
            System.out.println(color);
        }

        System.out.println();
        System.out.println("A quantidade de cores que o arco-íris tem: ");
        System.out.println(rainbowColors.size() + " POSITIONS");

        System.out.println();
        System.out.println("Usando o TreeSet para exibir em ordem alfabética..");
        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> rainbowColors2 = new TreeSet<>(rainbowColors);
        System.out.println(rainbowColors2);

        System.out.println();
        System.out.println("Usando o LinkedHashSet para exibir na ordem inversa");
        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> rainbowColors3 = new LinkedHashSet<>(
                Arrays.asList("VIOLETA", "ANIL", "VERDE", "AMARELO", "LARANJA", "VERMELHO")
        );
        System.out.println(rainbowColors3);
        List<String> rainbowColorsList = new ArrayList<>(rainbowColors3);
        Collections.reverse(rainbowColorsList);
        System.out.println(rainbowColorsList);

        System.out.println();
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String color : rainbowColors) {
            if (color.startsWith("V")){
                System.out.println(color);
            }
        }

        System.out.println();
        System.out.println("Para percorrer uma lista de forma simples, usamos o foreach");
        System.out.println("Mas como precisamos remover elementos, temos que usar o Iterator");
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = rainbowColors.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(rainbowColors);

        System.out.println();
        System.out.println("Limpe o conjunto: ");
        rainbowColors.clear();

        System.out.println();
        System.out.println("Confira se o conjunto está vazio: " + rainbowColors.isEmpty());

    }
}
