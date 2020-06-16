package one.digitalinovationone.OOexercicio3;

public class Imposto
{
    private Double salario;

    public void setSalario(Double salario)
    {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public Double calculaImposto()
    {
        return this.salario * (0.1/100);
    }


}
