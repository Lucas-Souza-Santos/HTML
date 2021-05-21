package digital.innovation.one.aula03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExemploHashSet
{
    public static void main(String[] args)
    {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);
        System.out.println("------");
        System.out.println(notasAlunos.add(null));

        // remover a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        // Retornar a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // navegar por todos os itens do iterador
        Iterator<Double> iterador = notasAlunos.iterator();

        while (iterador.hasNext())
        {
            System.out.println(iterador.next());
        }

        for(double nota: notasAlunos)
        {
            System.out.println(nota);
        }

        notasAlunos.clear();

        // retorna se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty());


    }
}
