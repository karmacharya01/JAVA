public class Time {

    int hours;
    int minutes;
    int seconds;

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    Time add(Time t) {
        Time result = new Time();

        result.seconds = this.seconds + t.seconds;
        result.minutes = this.minutes + t.minutes;
        result.hours = this.hours + t.hours;

        result.minutes += result.seconds / 60;
        result.seconds = result.seconds % 60;

        result.hours += result.minutes / 60;
        result.minutes = result.minutes % 60;

        return result;
    }

    Time subtract(Time t) {
        Time result = new Time();

        int s1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int s2 = t.hours * 3600 + t.minutes * 60 + t.seconds;

        int diff = Math.abs(s1 - s2);

        result.hours = diff / 3600;
        diff %= 3600;
        result.minutes = diff / 60;
        result.seconds = diff % 60;

        return result;
    }

    public static void main(String[] args) {

        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 20, 30);

        System.out.print("Time 1: ");
        t1.display();

        System.out.print("Time 2: ");
        t2.display();
        Time sum = t1.add(t2);
        System.out.print("Added Time: ");
        sum.display();

        Time diff = t1.subtract(t2);
        System.out.print("Subtracted Time: ");
        diff.display();
    }
}
