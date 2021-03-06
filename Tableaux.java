import java.util.Arrays;

/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierDecroissantSSS(int[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void print(int[] tab){
        System.out.println(Arrays.toString(tab));
    }

    public static int maximum(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++){
                if (tab[i] > max)
                    max = tab[i];
            }
        return max;
    }

    public static int minimum(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++){
            if (tab[i] < min)
                min = tab[i];
        }
        return min;
    }

    public static float moyenne(int[] tab){
        float moyenne;
        float somme = 0;
        for (int i = 0; i < tab.length; i++){
            somme += tab[i];
        }
        moyenne = somme / tab.length;
        return moyenne;
    }

    public static int fouilleSeq(int[] tab, int cherche){
        boolean trouve = false;
        int i = 0;
        while (i < tab.length && !trouve){
            if (tab[i] == cherche)
                trouve = true;
            else
                i++;
        }
        if (trouve)
            return i;
        else
            return -1;
    }

    public static void trierDecroissantSSS(String[] tab){
        int imin;
        for (int i=0; i<tab.length-1; i++){
            imin = i;
            for (int j=i+1; j<tab.length; j++){
                if (Integer.parseInt(tab[j]) > Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }
    public static void print(String[] tab){
        System.out.println(Arrays.toString(tab));
    }

    public static String maximum(String[] tab) {
        String max = tab[0];
        for (int i = 0; i < tab.length; i++){
            if (tab[i].compareTo(max) > 0)
                max = tab[i];
        }
        return max;
    }
    public static String minimum(String[] tab) {
        String min = tab[0];
        for (int i = 0; i < tab.length; i++){
            if (tab[i].compareTo(min) < 0)
                min = tab[i];
        }
        return min;
    }
    public static float moyenne(String[] tab){
        float moyenne;
        float somme = 0;
        for (int i = 0; i < tab.length; i++){
            somme += Integer.parseInt(tab[i]);
        }
        moyenne = somme / tab.length;
        return moyenne;
    }
    public static int fouilleSeq(String[] tab, int cherche){
        boolean trouve = false;
        int i = 0;
        while (i < tab.length && !trouve){
            if (Integer.parseInt(tab[i]) == cherche)
                trouve = true;
            else
                i++;
        }
        if (trouve)
            return i;
        else
            return -1;
    }
}
