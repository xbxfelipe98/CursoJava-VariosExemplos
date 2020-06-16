package one.digitalinovationone.OOexercicio1;

import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas pessoas existem no carro?");


        String quantidade = s.next();

        Carro carro = new Carro();
        carro.setQuantidade(quantidade);
        System.out.println(carro.quantidadepessoascarro());

    }
}
