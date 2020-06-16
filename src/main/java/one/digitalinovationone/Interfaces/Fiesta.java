package one.digitalinovationone.Interfaces;

public class Fiesta implements Carro,Veiculo
{
    @Override
    public String marca()
    {
        return "Ford";
    }

    @Override
    public String registro()
    {
        return "123456s";
    }

    @Override
    public void ligar()
    {
        Carro.super.ligar();;
        Veiculo.super.ligar();
    }
}
