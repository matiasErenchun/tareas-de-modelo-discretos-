import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Universo
{

    private HashSet conjuntos;

    public Universo()
    {
        this.conjuntos = new HashSet();
    }

    public boolean addConjunto(String string)
    {
        if(conjuntos.contains(string))
        {
            return false;
        }
        else
        {
            return conjuntos.add(string);
        }
    }

    public void printConjuntos()
    {
        Object[]miUniverso = conjuntos.toArray();
        ArrayList<String>universe = new ArrayList<>();
        for (Object string:miUniverso)
        {
            universe.add(string.toString());
        }
        Collections.sort(universe);
        for (String string:universe)
        {
            System.out.println(string);
        }


    }
}
