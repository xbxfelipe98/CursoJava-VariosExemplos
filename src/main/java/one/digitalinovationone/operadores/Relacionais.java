package one.digitalinovationone.operadores;

public class Relacionais
{
    public static void main(String[] args)
    {
        final var numero = 6;

        if (numero > 20)
        {
            System.out.println("O número é maior que 20");
        }
        else if (numero >= 10)
        {
            System.out.println("O número é maior igual a 10");
        }
        else if (numero <=5)
        {
            System.out.println("O número é menor igual a 5");
        }
        else
        {
            System.out.println("Nenhuma das anteriores");
        }
    }
}
