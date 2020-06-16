package one.digitalinovationone.Interfaces;

public interface Carro
{
    String marca();

    default void ligar()
    {
        System.out.println("Ligando o carro!");
    }
}
