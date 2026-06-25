class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

        a += 3;   // +=, -=
        System.out.println(a); // 13

        int x = a++;
        System.out.println(x); // 13
        System.out.println(a); // 14

        int y = ++a;
        System.out.println(y); // 15
        System.out.println(a); // 15


        int marksA = 95;
        int marksB = 90;
        System.out.println(marksA > marksB); // True
        System.out.println(marksA >= marksB); // True
        System.out.println(marksA < marksB); // False
        System.out.println(marksA <= marksB); // False
        System.out.println(marksA == marksB); // False
        System.out.println(marksA != marksB); // True


        int ageA = 20;
        int ageB = 25;
        int ageC = 30;
        int ageD = 35;
        System.out.println(ageA > ageB & ageC< ageD); // False
        System.out.println(ageA > ageB | ageC< ageD); // True
        System.out.println(ageA > ageB && ageC< ageD); // False
        System.out.println(ageA > ageB || ageC< ageD); // True

        boolean pass = true;
        System.out.println(!pass); // False

    }
}
