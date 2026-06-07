public class CountingNum {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 9, 11 };
        int l = 0;
        int u = arr.length - 1;
        int key = 7;
        CountingNum obj = new CountingNum();
        int result = obj.Searching(arr, l, u, key);

        System.out.println(result);

    }

    int Searching(int arr[], int l, int u, int key) {

        int mid = (l + u) / 2;
        int count=0;

        if (key == arr[mid]) {
            count++;
        } else if (key < arr[mid]) {
            count++;
            return Searching(arr, l, mid - 1, key);
        } else {
            count++;
            return Searching(arr, mid + 1, u, key);
        }
        return count;

    }
}
