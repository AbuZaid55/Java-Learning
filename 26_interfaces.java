// interface is like abstract class and all method inside this will be abstract method
// All the variable inside interface is final and static

interface Test {
    public void config();
}

interface A extends Test {

    public String name = "Abu Zaid"; // final and static

    public void show();
}

interface B {
    public void drive();
}

class Car implements A {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

class RR implements A,B { // A class can implements multiple interfaces
    public void show() {
        System.out.println("in rr show");
    }

    public void config() {
        System.out.println("in rr config");
    }

    public void drive() {
        System.err.println("Driving...");
    }
}

class Interfaces {
    public static void main(String[] args) {
        Car car = new Car(); // or A car = new Car()
        car.show();
        car.config();

        // A.name = "Hi"; // can not change because name is final

        System.out.println(A.name); // name is static so we can called direact using class name or interface name
        // or
        System.out.println(Car.name);


        RR rr = new RR();
        rr.show();
        rr.config();
        rr.drive();
    }
}