package uke39;

/*
En forAlle-løkke kan iterere i en vanlig tabell og i en instans av en klasse som implementerer Iterable.
Lag kode med en heltallstabell der noen tall er mindre enn og noen større enn 10.
Bruk så en forAlle-løkke til å finne antallet som er større enn 10.
 */

public class Uke39_311_Oppg2 {
    public static void main(String[] args) {
        int[] a = {4,9,12,7,16,20,8,3,11,3,6};

        int antall = 0;
        for (int k : a) if (k > 10) antall++;

        System.out.println(antall);
    }
}
