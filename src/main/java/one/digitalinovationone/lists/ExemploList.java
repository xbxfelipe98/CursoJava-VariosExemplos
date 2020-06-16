package one.digitalinovationone.lists;

import java.util.*;

public class ExemploList
{
    public static void main (String[] args)
    {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.addAll(nomes);
        System.out.println(nomes);
        nomes.set(2, "Larissa"); //Altera valor da posição

        System.out.println(nomes);

        Collections.sort(nomes);//Ordenação

        nomes.set(2, "Felipe"); //Altera valor da posição depois da ordenação

        System.out.println(nomes);


        nomes.remove(4); //Remove elemento da lista
        System.out.println(nomes);

        nomes.remove("Maria"); //Remove elemento da lista
        System.out.println(nomes);


        String nome = nomes.get(1);//Capturar elemento em uma variavel
        System.out.println(nome);

        if(nome != nomes.get(1))
        {
            System.out.println("igual");
        }
        System.out.println("213"+nome.indexOf("Carlos"));

        int posicao = nome.indexOf("Carlos"); //Verifica indice do parametro passado;
        System.out.println(nomes);

        int tamanho = nomes.size(); //Quantos elementos tem na lista
        System.out.println(tamanho);

        boolean temFelipe = nomes.contains("Felipe"); //Diz se existe esse elemento
        System.out.println(temFelipe);

        for (String nomeDoItem: nomes) //for para rodar lista
        {
            System.out.println("-->"+nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext())
        {
            System.out.println("---->"+iterator.next());
        }


        nomes.clear(); //Limpa lista

        boolean listaEstaVazia = nomes.isEmpty();  //Verifica se a lista está vazia
        System.out.println(listaEstaVazia);






    }

}
