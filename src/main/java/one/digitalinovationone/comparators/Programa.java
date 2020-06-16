package one.digitalinovationone.comparators;

import java.util.*;

public class Programa
{
    public static void main(String[] args)
    {
        List<Carro> carros =new ArrayList<>();

        carros.add(new Carro(2,"Fiat"));
        carros.add(new Carro(1,"Wolks"));

        System.out.println(carros);

        carros.sort((first,second) -> first.getMarca() -second.getMarca());
        System.out.println(carros);

        carros.sort((first,second) -> second.getMarca() - first.getMarca());
        System.out.println(carros);

        carros.sort(Comparator.comparingInt(Carro::getMarca));
        System.out.println(carros);

        carros.sort(Comparator.comparingInt(Carro::getMarca).reversed());
        System.out.println(carros);


        Collections.sort(carros); //Precisa estar implements Comparable




    }
}
