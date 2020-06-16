package one.digitalinovationone.finals;

public class CasualGamer extends Gamer
{
    @Override
    public String keyboard()
    {
        return "Simples Keyboard...";
    }

   // @Override
   //public String mouse()
   // {
   //     return super.mouse();
   // }

    public String play(final String game)
    {
        return "Jogando " +game;

    }
}
