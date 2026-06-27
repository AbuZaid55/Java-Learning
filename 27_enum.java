// An enum (enumeration) is a special type used to define a fixed set of constants.
// Enum Can Have Constructors and Methods also.
enum Status {
    Running, Failed, Pending, Success;
    public void display() {
        System.out.println("Status is " + this);
    }
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface;
    public int price;

    private Laptop() { // it will give price of Surface
        this.price = 500;
    }

    private Laptop (int price) {
        this.price = price;
    }
}

class Enum {
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s); // Failed
        System.out.println(Status.Running); // Running
        s.display(); // Status is Failed
        Status.Running.display(); // Status is Running

        System.out.println(s.ordinal()); // 1
        System.out.println(Status.Running.ordinal()); // 0

        Status ss[] = Status.values();
        System.out.println(ss[2]); // Pending
        ss[2].display(); // Status is Pending

        Laptop lap = Laptop.Macbook;
        System.out.println(lap); // Macbook
        System.out.println(lap.price); // 2000

        System.out.println(Laptop.Surface.price); // 500
    }
}
