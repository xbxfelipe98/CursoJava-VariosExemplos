package one.digitalinovationone.sets;

import java.util.HashSet;
import java.util.Set;

public class ExercicioHashSet
{
    public static void main(String[] args)
    {
        Set<Integer> numeros = new HashSet<>();

        /*numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);*/

        numeros.add(4);
        numeros.add(2);
        numeros.add(23);
        numeros.add(14);
        numeros.add(55);

        System.out.println(numeros);
        numeros.add(null);
        System.out.println(numeros);
        Integer primeiro =0;

        for(Integer nu:numeros)
        {
            primeiro = nu;
            break;
        }

        numeros.remove(primeiro);
        System.out.println(numeros);

        numeros.add(23);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());

    }

}
