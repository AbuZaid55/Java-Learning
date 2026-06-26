class Calculator {
    public int add (int a, int b){
        return a + b;
    }
}

class AdvanceCalculator extends Calculator {
    public int divide (int a, int b){
        return a/b;
    }
}

// this is called multi level inharitance
class VeryAdvanceCalculator extends AdvanceCalculator {
    public double power(int a, int b){
        return Math.pow(a, b);
    }
}

class Inharitance {
    public static void main(String[] args) {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        System.out.println(advanceCalculator.divide(5,2));
        System.out.println(advanceCalculator.add(5,7));  // here we can use add method while that are not in advance calculator. it because extends keyword that allow to use all super class method in sub class. here Calculator is super class and AdvanceCalculator is sub class and this is called Inharitance.
    }
}