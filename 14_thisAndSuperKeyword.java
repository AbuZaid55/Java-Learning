class A {
    public A(){
        System.out.println("in A");
    }
    public A(String text){
        System.out.println(text + " From A");
    }
}

class B extends A {
    public B(){
        System.out.println("in B");
    }
    public B(String text){
        super(text); // this is used to call super class constructor
        // super();
        // this(); // using this keyword we can call constructor of same class
        System.out.println(text + " From B");

    }
}

class ThisAndSuperKeyword {
    public static void main(String[] args) {
        new B("Hello");
    }
}