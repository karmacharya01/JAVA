class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Value of x in Parent: " + x);
    }
   
}

class Child extends Parent {
    int x = 20;

    Child() {
        super(); // calls parent constructor
        System.out.println("Child constructor");
    }

    void show() {
        super.show(); // calls parent method
        System.out.println("Value of x in Child: " + x);
        System.out.println("Value of x using super: " + super.x);
    }

    
}
public class SuperKeywordDemo {
 public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
    
}
