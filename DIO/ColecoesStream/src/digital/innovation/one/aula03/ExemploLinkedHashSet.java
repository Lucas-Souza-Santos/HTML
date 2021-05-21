package digital.innovation.one.aula03;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> sequeciaNumeros = new LinkedHashSet<>();
        
        // Adicionando os números
        sequeciaNumeros.add(1);
        sequeciaNumeros.add(2);
        sequeciaNumeros.add(4);
        sequeciaNumeros.add(8);
        sequeciaNumeros.add(10);

        System.out.println(sequeciaNumeros);

        // Remover número do set
        sequeciaNumeros.remove(4);
        System.out.println(sequeciaNumeros);

        //Retornar o números de itens do set
        System.out.println(sequeciaNumeros.size());

        // navegar nos itens com iterator
        Iterator<Integer> iterator = sequeciaNumeros.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // navegar com forEach
        for(int num: sequeciaNumeros)
        {
            System.out.println(num);
        }

    }
}
