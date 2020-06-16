package one.digitalinovationone.sets;

import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        Integer primeiroNumero=0;
        for(Integer nu :numeros)
        {
            primeiroNumero = nu;
            break;
        }

        numeros.remove(primeiroNumero);
        numeros.add(23);

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
    }
}
