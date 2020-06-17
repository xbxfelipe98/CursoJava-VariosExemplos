package one.digitalinovationone.optinals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Programa
{
    public static void main (String[] args)
    {
        Optional<String> optionalString = Optional.of(null);

        //System.out.println(optionalString.ofNullable("Carla"));

        optionalString.ifPresentOrElse(System.out::println,()->System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable("Carla");


        optionalNull.ifPresentOrElse(System.out::println,()->System.out.println("não está presente"));

        Optional<String> emptyNull = Optional.empty();
        emptyNull.ifPresentOrElse(System.out::println,()->System.out.println("não está presente"));

        //Optional<String> erroNull = Optional.of(null); //Não funciona


        //TIPOs PRIMITIVOS

        OptionalInt.of(12).ifPresent(System.out::println);
        OptionalDouble.of(12.1).ifPresent(System.out::println);
        OptionalLong.of(32L).ifPresent(System.out::println);


        System.out.println(optionalString.isPresent());
        // Dando erro não sei pq
        //System.out.println(optionalString.isEmpty());

        //só joga se o valor for presente
        if (optionalString.isPresent())
        {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        //optionalString.map((valor) -> valor.concat("****")).isPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));





    }
}
