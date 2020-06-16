package one.digitalinovationone.data2exercicio2;

import java.util.Calendar;

public class Programa
{
    public static void main(String[] args)
    {
        int semana;

        Calendar datapagamento = Calendar.getInstance();
        datapagamento.set(Calendar.YEAR, 2020);
        datapagamento.set(Calendar.DATE, 13);
        datapagamento.set(Calendar.MONTH, 5);

        Calendar vencimento = Calendar.getInstance();
        vencimento.set(Calendar.YEAR, 2020);
        vencimento.set(Calendar.DATE, 13);
        vencimento.set(Calendar.MONTH, 5);

        for (int i=0; i<10;i++ )
        {

            vencimento.add(Calendar.DATE, 1);
            semana = vencimento.get(Calendar.DAY_OF_WEEK);

            if (semana == 1)
            {
                vencimento.add(Calendar.DATE, 2);
                i--;
            }
            else if (semana == 7)
            {
                vencimento.add(Calendar.DATE, 1);
                i--;
            }

        }

        System.out.println(vencimento.getTime());





    }
}
