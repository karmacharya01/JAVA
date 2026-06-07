public class OddEven {
    public void Checker(int num) {
        if (((num / 2) * 2) == num) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        OddEven obj = new OddEven();
        obj.Checker(12);
        obj.Checker(13);
        obj.Checker(25);
        obj.Checker(18);
    }
}