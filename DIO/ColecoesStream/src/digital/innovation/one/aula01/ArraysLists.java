package digital.innovation.one.aula01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraysLists
{
    public static void main(String[] args)
    {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Antonio");
        nomes.add("Nancy");
        nomes.add("Tiago");
        nomes.add("Camila");

        System.out.println(nomes);


        // Trocando o nome da posição 2 por Larissa
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        // Colocar em ordem alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        // removendo um elemento da lista
        nomes.remove(4);
        System.out.println(nomes);

        // tamanho da lista
        System.out.println(nomes.size());

        List<String> nomesCopy = new ArrayList<>();

        nomesCopy.addAll(nomes);

        System.out.println(nomesCopy);

        // método iterator
        Iterator<String> iterator = nomes.iterator();
        System.out.println("========================================");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("========================================");

    }
}
