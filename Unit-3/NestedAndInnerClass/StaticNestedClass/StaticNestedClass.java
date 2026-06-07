package NestedAndInnerClass.StaticNestedClass;
public class StaticNestedClass {
    // int a=10;
    static int b=20;
    static class NestedStructuredemo{
        void show(){
            b=30;
            //  System.out.println("Value of a:"+a);
            System.out.println("Value of b:"+b);
        }
    }
    public static void main(String[] args) {
        StaticNestedClass.NestedStructuredemo obj=new StaticNestedClass.NestedStructuredemo();
        obj.show();
        
    }
}
