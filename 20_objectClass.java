class A {
    // be default this is like -> "class A extends Object { }"
    public String name = "Abu Zaid";
}

class B {
    public String name = "Zaid";
    public String toString() {
        return name;
    }
    public boolean equals(B that){
        return this.name == that.name;
    }
}

class ObjectClass {
    public static void main(){
        A a = new A();
        // when we print object then it by default obj.toString()
        System.out.println(a.toString()); // print some address

        B b = new B();
        System.out.println(b.toString()); // print "Zaid"
        System.out.println(b); // print "Zaid" because by defautl b.toString()


        B b1 = new B();
        B b2 = new B();
        boolean result = b1.equals(b2); // without immplement of equeal method in B it will return false.
        System.out.println(result);
    }
}