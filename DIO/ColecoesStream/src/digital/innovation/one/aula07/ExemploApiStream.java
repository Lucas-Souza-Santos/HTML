package digital.innovation.one.aula07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploApiStream
{
    public static void main(String[] args)
    {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Maria");
        estudantes.add("Joaquina");
        estudantes.add("Fernando");
        estudantes.add("Thomas");
        estudantes.add("Lucas");
        estudantes.add("Tiago");
        estudantes.add("Camila");

        // Retornar a ccontagem de elementos do streamm
        System.out.println("Contagem " + estudantes.stream().count());

        // Retornar o elementos com a maior quantidade de letras
        System.out.println("Maior numeros de letras:: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retornar o elemento com o menor quantidade de letras
        System.out.println("Menor numeros de letras:: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retornar o elemento que tem a letra R no nome
        System.out.println("Com letra r no nome:: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase()
        .contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras:: " + estudantes.stream()
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));

        // Retorna os 3 primeiros elementos da coleção
        System.out.println();
    }


}
