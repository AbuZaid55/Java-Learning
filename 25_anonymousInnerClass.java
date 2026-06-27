class A {
    public void show(){
        System.out.println("in show");
    }
    public void fly(){
        System.out.println("in fly");
    }
}
abstract class B {
    public abstract void drive();
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A(){ // anonymous inner class
            // overriding show method using anonymous class
            public void show() {
                System.out.println("new show");
            };
        };
        a.show(); // new show
        a.fly(); // in fly

        B b = new B() { 
            // we can use anonymous class to define abstact method of abstract class. we don't need to extrands B class in any new class
            public void drive() {
                System.out.println("Driving...");
            }
        };
        b.drive();
    }
}