public class Main {
    public static void main(String[] args)
    {
        Konto k1 = new Konto("Anna Kowalska", 1000.0);
        Konto k2 = new Konto("Jan Nowak");
        Konto k3 = new Konto("   ", -50.0);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.println("Wplata 200 na konto nr 2: " + (k2.wplac(200.0) ? "OK" : "ODMOWA"));
        System.out.println("Wyplata 300 z konta nr 1: " + (k1.wyplac(300.0) ? "OK" : "ODMOWA"));
        System.out.println("Wyplata 500 z konta nr 2: " + (k2.wyplac(500.0) ? "OK" : "ODMOWA"));
        System.out.println("Wplata -50 na konto nr 2: " + (k2.wplac(-50.0) ? "OK" : "ODMOWA"));
        System.out.println("Wplata 6000 na konto nr 1: " + (k1.wplac(6000.0) ? "OK" : "ODMOWA"));
        System.out.println("Wyplata 6000 z konta nr 1: " + (k1.wyplac(6000.0) ? "OK" : "ODMOWA"));
        System.out.println("Wyplata 5000 z konta nr 1: " + (k1.wyplac(5000.0) ? "OK" : "ODMOWA"));

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println("Liczba kont: " + Konto.getLiczbaKont());
        System.out.println("Konto nr 1 ma wiecej niz konto nr 2: " + (k1.maWiecejNiz(k2) ? "TAK" : "NIE"));
    }
}
