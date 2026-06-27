class A {
    public void show1(){
        System.out.println("From A");
    }
}

class B extends A {
    public void show2(){
        System.out.println("From B");
    }
}

class UpAndDownCasting {
    public static void main(){
        A obj1 = new B(); // or A obj1 = (A) new B()  // Upcasting
        obj1.show1(); // From A

        B obj2 = (B) obj1; // Downcasting
        obj2.show2(); // From B
    }
}