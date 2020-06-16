package one.digitalinovationone.OOexercicio3;

public class Gerente extends Imposto
{

    public Double calculaImposto()
    {
        return this.getSalario() *  (0.1/100);
    }
}
