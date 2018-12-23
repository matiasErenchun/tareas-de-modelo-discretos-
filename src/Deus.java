import java.util.ArrayList;

public class Deus
{
    private ArrayList<Dimension> universoActual;


    public Deus()
    {
        this.universoActual = new ArrayList<>();
        this.universoActual.add(this.laPrimeraChispa(20));
        this.printUniverso();
    }

    public boolean agregarDimension(Dimension dimension)
    {
        return this.universoActual.add(dimension);
    }

    public Dimension laPrimeraChispa(int n)
    {
        Dimension dimension1=new Dimension();
        Integer i=0;
        while(i<n)
        {
            Conjunto con = new Conjunto();
            con.agregarElemento(i);
            dimension1.agregarConjunto(con);
            i++;
        }

        return dimension1;
    }

    public void printUniverso()
    {
        for (Dimension dim: this.universoActual)
        {
            dim.printDimension();
        }
    }
}
