class A {
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B {
        public void config(){
            System.out.println("in config");
        }
    }
    static class C {
        public void drive(){
            System.out.println("in drive");
        }
    }
}

class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        A.B b = a.new B();
        b.config();

        A.C c = new A.C(); // for static we don't need object
        c.drive();
    }
}