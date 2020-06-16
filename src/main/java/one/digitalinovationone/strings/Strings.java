package one.digitalinovationone.strings;

public class Strings
{
    public static void main(String[] args)
    {
        var nome = "Felipe";
        var sobrenome= "Alves Pinto";

        final var nomeCompleto = nome +sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: " +nomeCompleto);

        var string = new String(" Minha String ");

        System.out.println("Char na posição: " +string.charAt(5));
        System.out.println("Quantidade: " +string.length());
        System.out.println("Trim: " +string.trim());
        System.out.println("Lower: " +string.toLowerCase());
        System.out.println("Upper: " +string.toUpperCase());
        System.out.println("Contém: " +string.contains("M"));

        System.out.println("Replace: " +string.replace("n","$"));
        System.out.println("Equals: "+string.equals(" Minha String "));
        System.out.println("Equals ignore case: "+string.equalsIgnoreCase(" MINha STRing "));

        System.out.println("Substring (1,6): " +string.substring(1,6));


        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula ".concat("de Java"));
        System.out.println("123 asda qw".replaceAll("[0-9]","#"));

    }
}
