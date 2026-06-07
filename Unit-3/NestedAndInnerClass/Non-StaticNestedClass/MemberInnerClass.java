
class MemberInnerClass{
    void display(){
        Inner objInner=new Inner();
        objInner.show();
    }
    class Inner{
        void show(){
            System.out.println("Inside Inner.");
        }
    }
    public static void main(String[] args) {
        MemberInnerClass objOuter=new MemberInnerClass();
        objOuter.display();
        
    }
}
