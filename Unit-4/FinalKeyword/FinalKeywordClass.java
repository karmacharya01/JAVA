package FinalKeyword;


final class SuperClass{
    void dekhau(){
        System.out.println("Super class");

    }
}
// class DerivedClass extends SuperClass
class DerivedClass{
    void dekhau (){
        System.out.println("Derived class");
        
    }
}

public class FinalKeywordClass {
    public static void main(String[] args) {
        
        DerivedClass obj=new DerivedClass();
        obj.dekhau();

    }
    
}
