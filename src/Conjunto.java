import java.util.ArrayList;
import java.util.Collections;

public class Conjunto
{
    private ArrayList<Integer> esteConjunto;


    public Conjunto()
    {
        this.esteConjunto = new ArrayList<Integer>();

    }

    public boolean agregarElemento(Integer in)
    {
        if(this.esteConjunto.size()==0)
        {
            this.esteConjunto.add(in);
            return true;
        }
        if(this.esteConjunto.get(this.esteConjunto.size()-1)<in)
        {
            this.esteConjunto.add(in);
            Collections.sort(this.esteConjunto);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printConjunto()
    {
        String strConjunto = this.esteConjunto.toString();
        System.out.println(strConjunto);
    }

    public String myToSreing()
    {
        String fin ="";
        int i=0;
        for (Integer in: this.esteConjunto)
        {
            if(i<this.esteConjunto.size()-1)
            {
                fin = fin + in.toString() + ",";
            }
            else
            {
                fin = fin + in.toString();
            }
            i++;
        }
        return fin;
    }

    public Conjunto copiarConjunto()
    {
        Conjunto nuevoConjunto = new Conjunto();
        for (Integer in: this.esteConjunto)
        {
            nuevoConjunto.agregarElemento(in);
        }

        return nuevoConjunto;
    }

}
