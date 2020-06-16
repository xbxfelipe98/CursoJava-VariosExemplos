package one.digitalinovationone.Interfaces;

public class Programa
{
    public static void main(String[] args)
    {
        final Carro gol = new Gol();
        System.out.println("Marca do gol: " +gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println("Registro do trator: " +trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();

        System.out.println(fiesta.marca());
        System.out.println(fiesta.registro());
        fiesta.ligar();
    }
}
