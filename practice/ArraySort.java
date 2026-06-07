
public class ArraySort {
    public static void main(String[] args) {
        int a[] = { 1, 5, 8, 3, 9, 12, 54 };
        int b[] = { 11, 21, 32, 12, 41 };
        int[] c = new int[a.length + b.length];
        int k = 0, i , j ;

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            // System.out.println(a[i]);
        }
        System.out.println();

        for (i = 0; i < b.length; i++) {
            for (j = i + 1; j < b.length - 1; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }

        }
        i=0;j=0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                System.out.println(c[k]);
                i++;
                k++;
            } else {
                c[k] = b[j];
                System.out.println(c[k]);
                j++;
                k++;
            }
        }
          while (i < a.length) {
            c[k] = a[i];
            System.out.println(c[k]);
            i++;
            k++;
        }
          while (i < b.length) {
            c[k] = b[j];
            System.out.println(c[k]);
            j++;
            k++;
        }
    }
}
