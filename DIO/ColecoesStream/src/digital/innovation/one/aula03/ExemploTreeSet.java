package digital.innovation.one.aula03;

import java.util.TreeSet;

public class ExemploTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        // Imprimindo os dados
        System.out.println(treeCapitais);

        // Retornar a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        // Retornar a ultima capital na arvore
        System.out.println(treeCapitais.last());

        // retornar a primeira capital abaixo da arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        // retornar a primeira capital acima da arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        // retornando a primeira capital do topo removendo
        System.out.println(treeCapitais.pollFirst());

    }
}
