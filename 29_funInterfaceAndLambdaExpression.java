// functional interface have only one method
// lambda exprssion use only on functional interface to make code short;
@FunctionalInterface
interface A {
    void show(); // by default public abstract void show();
}

@FunctionalInterface
interface B {
    void show();
}

@FunctionalInterface
interface C {
    void printAge(int age);
}

class FunctionalIntarface {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in A show");
            }
        };
        obj.show();


        // lambda expression
        B obj2 = () -> {
            System.out.println("in B show");
        };
        obj2.show();

        B obj3 = () -> System.err.println("in one line");
        obj3.show();

        C c = (age) -> System.out.println("Age is "+ age);
        c.printAge(24);
    }
}