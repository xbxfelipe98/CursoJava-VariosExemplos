package one.digitalinovationone.OOexercicio3;

public class Programa
{
    public static void main (String[] args)
    {
        Imposto supervisor = new Supervisor();
        supervisor.setSalario(100.00);
        System.out.println(supervisor.calculaImposto());

    }
}
