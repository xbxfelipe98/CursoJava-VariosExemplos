package one.digitalinovationone.sets;

import java.util.TreeSet;

public class ExercicioTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Integer primeiroNumero=0;
        for(Integer nu:numeros)
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
