package one.digitalinovationone.datasexercicio3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Programa
{
    public static void main (String[] args)
    {
        Date agora = new Date();

        SimpleDateFormat formatado = new SimpleDateFormat("DD/MM/YYYY");
        //SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = formatado.format(agora);

        System.out.println(dataformatada);



    }

}
