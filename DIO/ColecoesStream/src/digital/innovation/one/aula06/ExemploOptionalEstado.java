package digital.innovation.one.aula06;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalEstado
{
    public static void main(String[] args)
    {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente!!!"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente!!!"));


        System.out.println("Valor inteiro optional");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor double optional");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("Valor longo opticional");
        OptionalLong.of(23L).ifPresent(System.out::println);
        
        
    }
}
