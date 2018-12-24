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

                Conjunto co = (Conjunto) con;
                auxCon.add(co.myToSreing());

        }
        Collections.sort(auxCon);
        for (String cor:auxCon)
        {
            System.out.print("{"+cor+"} ");
        }
        System.out.println(" ");

    }

    public Conjunto[] entregarConjutos()
    {
        Object[] objCon = this.conjuntos.toArray();
        Conjunto [] misConjuntos = new Conjunto[objCon.length];
        int i=0;
        for (Object ob: objCon)
        {
            Conjunto con = (Conjunto) ob;
            misConjuntos[i]=con;
            i++;
        }

        return misConjuntos;
    }






}
