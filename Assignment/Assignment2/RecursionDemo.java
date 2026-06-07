class RecursionDemo {

  static  int factorial(int n) {
        if (n == 1) {          // base condition
            return 1;
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
