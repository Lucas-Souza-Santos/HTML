package digital.innovation.one.aula02;

import java.util.LinkedList;
import java.util.Queue;

public class Pilha
{
    public static void main(String[] args)
    {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco.size());

        // o método peek só retorna o primeiro elemento da fila
        String clienteAtendimento1 = filaBanco.peek();
        System.out.println(clienteAtendimento1);

        // o método poll retorna e remove o primeiro elemento da fila
        String clienteAtendimento2 = filaBanco.poll();

        System.out.println(clienteAtendimento2);
        System.out.println(filaBanco);

        filaBanco.clear();
        System.out.println(filaBanco.poll());

        try {
            filaBanco.element();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
