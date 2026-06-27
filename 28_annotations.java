class A {
    public void show(){
        System.out.println("in A");
    }
}
class B extends A {
    @Override // this is use to override method and if we type method name wrong it will give error. we can override methods without @Override but for safety we use this.
    public void show() {
        System.out.println("in B");
    }
}

@Deprecated // gives a warning that the method is deprecated. You can still use it, but it is recommended to use the newer alternative because it may be removed in a future version.
class Test {
    public void show(){
        System.out.println("in Test");
    }
}
class Annotations {
    public static void main(String[] args) {
        B b = new B();
        b.show(); // in B

        Test test = new Test();
        test.show();
    }
}