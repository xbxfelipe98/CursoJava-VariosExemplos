package one.digitalinovationone.Interfaces;

public interface Veiculo
{
    String registro();

    default void ligar()
    {
        System.out.println("Ligando o veículo");
    }
}
