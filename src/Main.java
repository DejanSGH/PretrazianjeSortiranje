import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] niz = new int[]{3,6,2,8,9,3,2,1};
        System.out.println(Arrays.toString(niz));
        bubbleSort(niz);
        System.out.println(Arrays.toString(niz));
        System.out.println("Pozicija je: " + binarySearch(niz, 8));

    }

    public static int binarySearch(int[] niz, int trazeni){
        int min = 0;
        int max = niz.length - 1;

       while (max > min){
           int p = (min + max) / 2;
           if(niz[p] == trazeni){
               return p;
           }
           if(niz[p] < trazeni){
               max = p;
           }
           else
           {
               min = p;
           }

       }
       return -1;
    }

    public static void bubbleSort(int[] niz){

        for (int i = 0; i < niz.length; i++) {
            boolean sortiran = true;
            for (int k = 0; k < niz.length-i-1; k++) {
                if(niz[k] < niz[k+1]){
                    int pomocna = niz[k];
                    niz[k] = niz[k+1];
                    niz[k+1] = pomocna;
                    sortiran = false;
                }
            }
            if(sortiran){
                return;
            }
        }
    }
}
