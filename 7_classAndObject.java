class Calculator {
    // Method overloading - Same method name but with different parameter
    public int add (int a, int b){
        return a + b;
    }
    public int add (int a, int b, int c){
        return a + b + c;
    }
    public void printResult(int result){
        System.out.println(result);
    }
}

class ClassAndObject {
    public static void main(String[] args) {
        Calculator cals = new Calculator();
        int result  = cals.add(5,4);
        int result2  = cals.add(5,4, 6);
        // System.out.println(result); // 9
        cals.printResult(result); // 9
        cals.printResult(result2); // 15
    }
}