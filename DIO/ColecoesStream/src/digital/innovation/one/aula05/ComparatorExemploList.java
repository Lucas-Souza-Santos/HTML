package digital.innovation.one.aula05;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExemploList
{
    public static void main(String[] args)
    {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("------ ordem de inserção -------");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("---- ordem natural dos números -- idade --");
        System.out.println(estudantes);

        // seguindo a msm linha de raciocinio do item acima, mas com a ordem inversa
        System.out.println("--- Seguindo agora a ordem reversa das idades ---- ");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println(estudantes);
    }
}
