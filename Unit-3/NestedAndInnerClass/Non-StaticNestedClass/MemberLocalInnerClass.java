public class MemberLocalInnerClass {
    int a=100;
    void myMethod(){
        class LocalInner{
            void display(){
                System.out.println("Outer:"+a);
                System.out.println("Its Local Inner Class");
            }
        }
        LocalInner objLocalInner=new LocalInner();
        objLocalInner.display();
    }
    public static void main(String[] args) {
        MemberLocalInnerClass objMemberLocalInnerClass=new MemberLocalInnerClass();
        objMemberLocalInnerClass.myMethod();
    }
    
}
