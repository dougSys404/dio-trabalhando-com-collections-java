package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
*Dadas as seguintes informações sobre meus gatos, crie uma lista
* e ordene esta lista exibindo:
* (nome - idade - cor)
*
* Gato1 = nome: Jon, idade: 10, cor: preto
* Gato2 = nome: simba, idade: 6 ,cor: tigrado
* Gato3 = nome: Jon, idade: 12, cor: amarelo
*
 */
public class Ex02_OrderingList {

    List<Cat> gatos = new ArrayList<>(){{
        add(new Cat("Jon", 10, "preto"));
        add(new Cat("Simba", 6, "trigrado"));
        add(new Cat("Jon", 12, "amarelo"));
    }};

    public void showOrderingList(){
        System.out.println("Lista original:");
        System.out.println(gatos);

        System.out.println();
        System.out.println("Exiba pela ordem inserida:");
        System.out.println(gatos);

        System.out.println();
        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println();
        System.out.println("Ordem natural:");
        Collections.sort(gatos);
        System.out.println(gatos);


    }
}
