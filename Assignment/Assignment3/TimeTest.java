class Time {

    int h,m,s;

    Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }

    void display(){
        System.out.println(h+":"+m+":"+s);
    }

    void add(Time t){
        int sec=s+t.s;
        int min=m+t.m+sec/60;
        int hr=h+t.h+min/60;

        System.out.println("Added Time: "+hr+":"+(min%60)+":"+(sec%60));
    }
}

public class TimeTest {

    public static void main(String args[]) {

        Time t1=new Time(2,30,40);
        Time t2=new Time(1,20,30);

        t1.display();
        t2.display();

        t1.add(t2);
    }
}
