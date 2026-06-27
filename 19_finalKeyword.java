// final - variable, method or class 
// final is used for constant and we can not change, extands or override it.
final class A {

}
// class B extends A { // can not extands

// }

class Calc {
    final public void show(){
        System.out.println("From Calc");
    }
}
class AdvanceCalc extends Calc {
    // public void show(){ // can not override
    //     System.out.println("From AdvanceCalc");
    // }
}
class FinalKeyword {
    public static void main(String[] args) {
        final int num = 8;
        // num = 9; // can not change
        System.out.println(num);
    }
}
