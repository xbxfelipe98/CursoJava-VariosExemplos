package one.digitalinovationone.queus;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList
{
    public static void main (String[] args)
    {
        Queue<String> filabanco = new LinkedList<>();

        filabanco.add("Pamela");
        filabanco.add("Patrícia");
        filabanco.add("Roberto");
        filabanco.add("Flavio");
        filabanco.add("Anderson");

        System.out.println(filabanco);



        String clienteASerAtendido = filabanco.poll();

        System.out.println(clienteASerAtendido);
        System.out.println(filabanco);

        String primeiroCliente = filabanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filabanco);

        filabanco.clear();
        String primeiroClienteOuErro = filabanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filabanco);

        for(String client: filabanco)
        {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filabanco.iterator();

        while (iteratorFilaBanco.hasNext())
        {
            System.out.println("-->>>"+iteratorFilaBanco.next());
        }

        System.out.println(filabanco.size());
        System.out.println(filabanco.isEmpty());
    }
}
