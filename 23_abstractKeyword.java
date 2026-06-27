// The abstract keyword is used to create incomplete classes and incomplete methods.

// 1. An abstract method has no body.
// 2. If a class has an abstract method, the class must be abstract.
// 3. We cannot create an object of an abstract class.
// 4. Abstract classes are used through inheritance.
// 5. A subclass must implement all abstract methods, or it must also be abstract.

abstract class Car {
    public abstract void drive();
    public void playMusic () {
        System.err.println("Play music");
    }
}

class BMW extends Car {
    public void drive() {
        System.out.println("Driving...");
        
    }
}

class AbstractKeyword {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.drive();
    }
}