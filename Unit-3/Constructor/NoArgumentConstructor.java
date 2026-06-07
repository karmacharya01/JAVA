package Constructor;

class NoArgumentConstructor {
    NoArgumentConstructor() {
        System.out.println("Constructor");
    }

    void display() {
        System.out.println("NO Argument Constructor.");
    }

    public static void main(String[] args) {
        NoArgumentConstructor obj = new NoArgumentConstructor();
        obj.display();

    }

}