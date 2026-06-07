

public class MissingNoOfArray {
    // public static void main(String[] args) {
    // int[] arr = { 1, 3, 5, 7, 9, 8, 2, 6 };
    // int sum = 0;
    // int sumn = 0;
    // int n = arr.length + 1;

    // for (int i = 0; i < arr.length; i++) {
    // sum += arr[i];
    // }

    // sumn = n * ((n + 1) / 2);

    // int missing = sumn - sum;
    // System.out.println(n);
    // System.out.println(sum);
    // System.out.println(sumn);
    // System.out.println(missing);
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 8, 2, 6 };
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        for (i = 1; i < arr.length-1; i++) {
            if(arr[i+1]!=arr[i]+1){
                System.out.println("Missing number:"+arr[i]+1);
            }

        }
    }
}

