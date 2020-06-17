package one.digitalinovationone.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Programa
{
    public static void main (String[] args)
    {
        //Cria coleção
        List<String> estudantes = new ArrayList<>();

        //Adicionar elementos
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //retorna quantidade de elementos da Stram
        System.out.println("Contagem: " + estudantes.stream().count());

        //retorna o tamanho da string
        System.out.println("Maior numero de letras: " +estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Maior numero de letras: " +estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna elementos que tem a letra r no nome
        System.out.println("Contem a letra r: " +estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //retorna uma nova coleção, com nomes concatenados  a quantidade de letras de cada nome
        System.out.println("Retorna uma nova coleção com quantidade de letras: "+ estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
    }
}
