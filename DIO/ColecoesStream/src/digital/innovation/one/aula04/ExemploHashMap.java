package digital.innovation.one.aula04;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap
{
    public static void main(String[] args)
    {
        Map<String, Integer> campeaoMundialFifa = new HashMap<>();

        // Adicionando os campeões da copa do mundo da fifa
        campeaoMundialFifa.put("Brasil", 5);
        campeaoMundialFifa.put("Alemanha", 4);
        campeaoMundialFifa.put("Italia", 4);
        campeaoMundialFifa.put("Uruguai", 2);
        campeaoMundialFifa.put("Argentina", 2);
        campeaoMundialFifa.put("França", 2);
        campeaoMundialFifa.put("Espanha", 1);
        campeaoMundialFifa.put("Inglaterra", 1);

        System.out.println(campeaoMundialFifa);

        // Atualizar o valor para a chave do Brasil
        campeaoMundialFifa.put("Brasil", 6);

        System.out.println(campeaoMundialFifa);

        //Retorna o Brasil
        System.out.println(campeaoMundialFifa.get("Brasil"));

        // Retorna se existe ou não um campeão França
        System.out.println(campeaoMundialFifa.containsKey("França"));

        // Remover a Argentina
        campeaoMundialFifa.remove("Argentina");

        System.out.println(campeaoMundialFifa);

        System.out.println(campeaoMundialFifa.containsValue(4));

    }
}
