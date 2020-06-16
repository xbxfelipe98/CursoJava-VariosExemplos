package one.digitalinovationone.comparators;

public class Carro implements Comparable<Carro>
{
    private final int marca;
    private final String modelo;

   public Carro(int marca, String modelo)
   {
       this.marca = marca;
       this.modelo = modelo;
   }

    public int getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString()
    {
        return marca+" - " +modelo;
    }

    @Override
    public int compareTo(Carro o)
    {
        return this.getMarca() - o.getMarca();
    }
}
