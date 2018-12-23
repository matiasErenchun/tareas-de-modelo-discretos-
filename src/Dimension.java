import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Dimension
{

    private HashSet conjuntos;

    public Dimension()
    {
        this.conjuntos = new HashSet();
    }

    public boolean agregarConjunto(Conjunto conjunto)
    {
        return this.conjuntos.add(conjunto);
    }

    public void printDimension()
    {
        Object[] misConjuntos = this.conjuntos.toArray();
        ArrayList<String> auxCon=new ArrayList<>();
        for (Object con: misConjuntos)
        {
            if(con.getClass().equals(Conjunto.class))
            {
                Conjunto co = (Conjunto) con;
                auxCon.add(co.myToSreing());
            }
        }
        Collections.sort(auxCon);
        for (String cor:auxCon)
        {
            System.out.println(cor);
        }

    }






}
