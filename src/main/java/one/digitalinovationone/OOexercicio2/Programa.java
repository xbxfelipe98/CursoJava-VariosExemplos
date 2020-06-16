package one.digitalinovationone.OOexercicio2;

import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        String marca = s.next();

        System.out.println("Digite o modelo:");
        String modelo = s.next();

        System.out.println("Digite o ano:");
        Integer ano = s.nextInt();

        System.out.println("Digite a variante:");
        String variante = s.next();

        Carro carro = new Carro();
        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAno(ano);
        carro.setVariante(variante);


        System.out.println(carro.getMarca());

    }
}
