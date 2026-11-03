import java.util.Objects;

public class Konto
{
    private final int numer;
    private final String wlasciciel;
    private double saldo;
    private int liczbaOperacji;
    private static int liczbaKont = 0;
    public static final double MAKSYMALNA_WYPLATA = 5000;

    public Konto(String wlasciciel)
    {
        liczbaKont++;
        this.numer = liczbaKont;
        this.wlasciciel = (wlasciciel == null || wlasciciel.trim().isEmpty()) ? "nieznany" : wlasciciel;
        this.saldo = 0.0;
        this.liczbaOperacji = 0;
    }
    public Konto(String wlasciciel, double saldoPoczatkowe)
    {
        this(wlasciciel);
        if (saldoPoczatkowe > 0)
        {
            this.saldo = saldoPoczatkowe;
        }
    }
    public int getNumer()
    {
        return numer;
    }
    public String getWlasciciel()
    {
        return wlasciciel;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public int getLiczbaOperacji()
    {
        return liczbaOperacji;
    }
    public static int getLiczbaKont()
    {
        return liczbaKont;
    }
    public boolean wplac(double kwota)
    {
        if (kwota <= 0)
        {
            return false;
        }
    this.saldo += kwota;
        this.liczbaOperacji++;
        return true;
    }
    public boolean czyMozewyplacic(double kwota)
    {
        return kwota > 0 && kwota <= this.saldo && kwota <= MAKSYMALNA_WYPLATA;
    }
    public boolean wyplac(double kwota)
    {
        if (!czyMozewyplacic(kwota))
        {
            return false;
        }
        this.saldo -= kwota;
        this.liczbaOperacji++;
        return true;
    }
    public boolean maWiecejNiz(Konto inneKonto)
    {
        return this.saldo > inneKonto.getSaldo();
    }
    public boolean przelew(Konto cel, double kwota)
    {
     if (wyplac(kwota))
     {
         cel.saldo -= kwota;
         return true;
     }
     return false;
    }
    @Override
    public String toString()
{
    return String.format
}
}
