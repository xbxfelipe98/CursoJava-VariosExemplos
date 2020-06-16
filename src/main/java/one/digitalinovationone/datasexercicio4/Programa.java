package one.digitalinovationone.datasexercicio4;

import com.sun.jdi.LocalVariable;

import java.time.LocalDateTime;

public class Programa
{
    public static void main (String[] args)
    {
        LocalDateTime dia = LocalDateTime.of(2020,5 ,30,10,00,00);

        LocalDateTime futuro = dia.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);

    }

}
