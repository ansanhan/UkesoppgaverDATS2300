package uke34;

public class Uke34Oppg2_3 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int max_index = max(a);

        System.out.println("Indeks til største tall er " + max_index);
        System.out.println("Det største tallet er " + a[max_index]);
    }
    static int max(int[] a) {
        int max_value = a[0];
        int max_index = 0;

        for (int i=1; i<a.length; ++i) {
            int value = a[i];
            int index = i;

            if (value >= max_value) {
                max_value = value;
                max_index = index;
            }
        }
        return max_index;
    }
}
