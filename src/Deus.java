import java.util.ArrayList;

public class Deus
{
    private ArrayList<Dimension> universoActual;


    public Deus(Integer n)
    {
        this.universoActual = new ArrayList<>();
        this.universoActual.add(this.laPrimeraChispa(n));
        this.crearUniverso(n);
        this.printUniverso();
    }

    public boolean agregarDimension(Dimension dimension)
    {
        return this.universoActual.add(dimension);
    }

    public Dimension laPrimeraChispa(int n)
    {
        Dimension dimension1=new Dimension();
        Integer i=1;
        while(i<=n)
        {
            Conjunto con = new Conjunto();
            con.agregarElemento(i);
            dimension1.agregarConjunto(con);
            i++;
        }

        return dimension1;
    }

    public void crearUniverso(int n)
    {
        int i=0;
        while(i<n)
        {
            this.universoActual.add(this.crearDimension(n));
            i++;
        }
    }

    public Dimension crearDimension(int n)
    {
        Dimension dim =this.universoActual.get(this.universoActual.size()-1);
        Conjunto [] con =dim.entregarConjutos();
        Dimension nuevaDim = new Dimension();
        int i=0;
        while (i<con.length)
        {
            int j=1;
            while(j<=n)
            {
                Conjunto auxCon = con[i].copiarConjunto();
                boolean a=auxCon.agregarElemento(j);
                if(a==true)
                {
                    nuevaDim.agregarConjunto(auxCon);
                }
                j++;
            }
            i++;
        }
        return nuevaDim;
    }

    public void printUniverso()
    {
        System.out.println("-");
        for (Dimension dim: this.universoActual)
        {
            dim.printDimension();
        }
    }
}
