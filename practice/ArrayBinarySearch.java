public class ArrayBinarySearch {
    int binarySearch(int arr[], int key, int lowbound, int highbound) {
        if (lowbound <= highbound) {

            int mid = (lowbound + highbound) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key <= arr[mid]) {
                return binarySearch(arr, key, lowbound, mid - 1);
            } else {
                return binarySearch(arr, key, mid + 1, highbound);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11, 12, 14, 16, 17, 19 };
        int lowbound = 0;
        int highbound = arr.length - 1;

        int key = 4;

        ArrayBinarySearch obj = new ArrayBinarySearch();
        int result = obj.binarySearch(arr, key, lowbound, highbound);

        if (result == 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }

}

// class Main {
// int BinarySearch(int a[],int key,int low,int high){
// if (low > high) {
// return -1;
// }
// int mid=(low+high)/2;

// if(key == a[mid]){
// return mid;
// }else if(key < a[mid]){
// return BinarySearch(a,key,low,mid-1);
// }else{
// return BinarySearch(a,key,mid+1,high);
// }

// }
// public static void main(String[] args) {
// int a[]={1,3,5,7,9,12,14,15,18,19};
// int key=18;
// int low=0;
// int high=a.length-1;

// Main obj=new Main();
// int result=obj.BinarySearch(a,key,low,high);

// if (result == -1)
// System.out.println("Number not found");
// else
// System.out.println("Number found at index " + result);
// }
// }
