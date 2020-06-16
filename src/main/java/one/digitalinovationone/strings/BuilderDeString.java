package one.digitalinovationone.strings;

public class BuilderDeString
{

    public static void main(String[] args)
    {
        var nome = "Felipe";

        final var builder = new StringBuilder(nome);

        System.out.println(builder.append("Luis"));

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var insert = reverse.insert(0,"#").insert(reverse.length(),"#");
        System.out.println(insert);
        

    }
}
