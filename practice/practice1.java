

class practice1 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 11, 21, 32, 12, 41 };
        int c[] = new int[a.length];
        int i, j;

        for (i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
            if (c[i] % 2 == 0) {
                c[i] -= 5;
                System.out.println(c[i]);
            } else {
                c[i] /= 2;
                System.out.println(c[i]);
            }
        }
        for (i = 0; i < c.length - 1; i++) {
            for (j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
