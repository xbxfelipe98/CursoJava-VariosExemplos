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

        //limita elementos
        System.out.println("Retorna 3 primeiros elementos: " +estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console e depois retorna a mesma coleçãp
        System.out.println("Retorna os elementos: " +estudantes.stream().peek(System.out::println).collect(Collectors.toList()));


        //Exibe cada elemento sem retornar
        System.out.println("Retorna elementos");
        estudantes.stream().forEach(System.out::println);

        //retorna true se todos os elementos possuem a letra w no nome
        System.out.println("Todos os elemento tem o w no nome: " +estudantes.stream().allMatch((elemento ->
                elemento.contains("w"))));

        //retorna true se algum elemento possuir a letra a no nome
        System.out.println("Algum elemento contem a letra a? " +estudantes.stream().anyMatch((elemento ->
                elemento.contains("a") )));

            //retorna true se nenhum elemento possuir a letra a no nome
        System.out.println("Nao tem nenhum elemento contem a letra a? " +estudantes.stream().noneMatch((elemento ->
                elemento.contains("a") )));


        //retorna o primeiro elemento
        System.out.println("Primeiro elemento: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //exemplo de operação encadeada

        System.out.println("Operação encadeada:");
        System.out.println(estudantes.stream().peek(System.out::println).map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).peek(System.out::println).
                //filter((estudante)-> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
                //collect(Collectors.toList()));
                //collect(Collectors.joining(",")));
                //collect(Collectors.toSet()));
                collect(Collectors.groupingBy((estudante)->estudante.substring(estudante.indexOf("-")+1))));




    }
}
