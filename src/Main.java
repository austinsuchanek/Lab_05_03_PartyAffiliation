public class Main
{
    public static void main(String[] args)
    {
        String party = "R";


        if(party.equals("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent");
        }
        else
        {
            System.out.println("You are an other");
        }
    }
}
