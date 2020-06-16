package one.digitalinovationone.OOexercicio3;

public class Supervisor  extends Imposto
{
    public Double calculaImposto()
    {
        return this.getSalario() *  (0.3/100);
    }
}
