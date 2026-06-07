public class ReturnValue {
    public static void main(String[] args) {
        int a=10,b=20;
        ReturnValue objecReturnValue=new ReturnValue();
        int c=objecReturnValue.sum(a,b);
        System.out.println("Sum is "+c);
    }
    int sum(int x, int y){
        int sum=x+y;
        return sum;
    }
    
}
