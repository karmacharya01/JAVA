

public class MergeArray {
    public static void main(String[] args) {
        int a[] = {3,5,7,2,1 };
        int b[] = { 0,9,8,4,6 };

        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1 + b1;
        int[] c = new int[c1];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
         for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }

}
