package one.digitalinovationone.maps;

import java.util.HashMap;
import java.util.Map;

public class ExcercicioHashMap
{
    public static void main(String[] args)
    {
        Map<String, String> mapa = new HashMap<>();

        mapa.put("AC","Acre");
        mapa.put("AL","Alagoas");
        mapa.put("AP","Amapa");
        mapa.put("AM","Amazonas");
        mapa.put("BA","Bahia");
        mapa.put("CE","Ceara");

        mapa.put("ES","Espirito Santo");
        mapa.put("GO","Goias");
        mapa.put("MA","Maranhão");
        mapa.put("MT","Mato Grosso");
        mapa.put("MS","Mato Grosso do Sul");
        mapa.put("MG","Minas Gerais");
        mapa.put("SP",null);




        mapa.remove("MG");

        mapa.put("DF","Distrito Federal");

        System.out.println(mapa.size());

        for(Map.Entry<String,String> entry1: mapa.entrySet())
        {
            if (entry1.getValue().equals("Mato Grosso do Sul"))
            {
                mapa.remove(entry1.getKey().toString());
                break;
            }
        }

        for(Map.Entry<String,String> entry: mapa.entrySet())
        {
            System.out.println( entry.getValue() +" - " + entry.getKey() );
        }

        System.out.println(mapa.containsKey("SC"));
        System.out.println(mapa.containsValue("Maranhão"));


    }
}
