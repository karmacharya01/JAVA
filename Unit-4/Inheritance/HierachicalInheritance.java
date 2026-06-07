package Inheritance;

class SuperClass{
    void display(){
        System.out.println("Super class");
    }
}
class DerivedClass1 extends SuperClass{
    @Override
    void display(){
        System.out.println("Derived class1");
    }
}
class DerivedClass2 extends SuperClass{
    @Override
    void display(){
        System.out.println("Derived class2");
    }
}
class DerivedClass3 extends SuperClass{
    @Override
    void display(){
        System.out.println("Derived class2");
    }
}

public class HierachicalInheritance {
    public static void main(String[] args) {
        
        DerivedClass1 obj1=new DerivedClass1();
        DerivedClass2 obj2=new DerivedClass2();
        DerivedClass3 obj3=new DerivedClass3();
        
        obj1.display();
        obj2.display();
        obj3.display();
        
    }
    
}
