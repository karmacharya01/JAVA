package Inheritance;

class SuperClass {
    int a, b, result;

    void sum() {
        a = 10;
        b = 20;
        result = a + b;
        System.out.println("Sum:" + result);
    }

    void sub() {
        a = 10;
        b = 20;
        result = a - b;
        System.out.println("Sub:" + result);
    }
}

class DerivedClass1 extends SuperClass {
    void mul() {
        a = 10;
        b = 20;
        result=a*b;
        System.out.println("Mul:"+result);
    }
}
class DerivedClass2 extends DerivedClass1{
    // void div(){
    //      a = 10;
    //     b = 20;
    //     result=a/b;
    //     System.out.println("div:"+result);
    // }
}
public class MultiLevel {

    public static void main(String[] args) {
        DerivedClass1 obj=new DerivedClass1();
        obj.sum();
        obj.sub();
        obj.mul();
        // obj.div();
    }
}