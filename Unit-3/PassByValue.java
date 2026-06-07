public class PassByValue {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before Calling the method:"+a);
        PassByValue obj=new PassByValue();
        obj.changeValue(a);
        System.out.println("After calling method:"+a);
    }
    void changeValue(int b){
        b=20;
        System.out.println("Inside the method:"+b);
    }
}
