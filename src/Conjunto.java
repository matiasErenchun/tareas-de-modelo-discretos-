import java.util.ArrayList;
import java.util.Collections;

public class Conjunto
{
    private ArrayList<Integer> esteConjunto;
    private int largo;

    public Conjunto()
    {
        this.esteConjunto = new ArrayList<Integer>();
        this.largo = 0;
    }

    public boolean agregarElemento(Integer in)
    {
        if(this.largo==0)
        {
            this.esteConjunto.add(in);
            this.largo++;
            return true;
        }
        if(this.esteConjunto.get(this.largo)<in)
        {
            this.esteConjunto.add(in);
            this.largo++;
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
        for (Integer in: this.esteConjunto)
        {
            fin=fin+in.toString();
        }
        return fin;
    }

}
