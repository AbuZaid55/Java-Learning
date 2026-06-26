class A {
    public void show (){
        System.out.println("Form A");
    }
}
class B extends A {
    public void show () {
        System.out.println("From B");
    }
}
class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.show(); // it will print "From B" so here we change show method of A using show method of B with same name and same parameter
    }
}