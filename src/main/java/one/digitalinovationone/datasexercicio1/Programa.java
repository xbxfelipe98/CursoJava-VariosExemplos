package one.digitalinovationone.datasexercicio1;

import java.time.Instant;
import java.util.Date;

public class Programa
{
    public static void main(String[] args)
    {
        Date nascimento = new Date(569655320000L);
        Instant instant = nascimento.toInstant();

        Date data = new Date(1273881600000L);

        System.out.println(nascimento);
        System.out.println(instant);

        System.out.println("Nascimento é posterior a 15/05/2010?" + nascimento.after(data));
        System.out.println("Nascimento é anterior a 15/05/2010?" + nascimento.before(data));
    }
}
