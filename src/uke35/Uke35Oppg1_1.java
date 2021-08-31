package uke35;

public class Uke35Oppg1_1 {
    public static void main(String[] args) {
        int[] values = {10, 3, 2, 9, 5, 3};

        System.out.println(min(values, 0, values.length));
        System.out.println(min(values));
    }
    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] < minverdi)
            {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }


    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }
}
