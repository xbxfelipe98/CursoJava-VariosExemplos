package one.digitalinovationone.strings;

public class StringFormat
{
    public static void main(String[] args)
    {
        var nome = "Felipe";
        var sobrenome= "Alves Pinto";
        final var nomeCompleto = nome +sobrenome;

        final var mensagem = String.format("O cliente %s possueisobre nome %s",nome,sobrenome);
        System.out.println(mensagem);
    }
}
