class DataTypes {
    public static void main(){
        // Interger data type
        byte age = 127;   // -128 to 127
        short year = 2026;
        int marks = 90;
        long population = 8000000000L;

        // deciaml value
        double salary = 50000.10; // by default decimal value is in double
        float pi = 3.14f;

        // characters
        char grade = 'A';

        // boolean
        boolean isPassed = true;

        // binary 
        int binaryNum = 0b101;

        // octal
        int octalNum = 031;

        // hexa
        int hexaNum = 0xA;

        // numeric literal with underscores
        int amount = 1_00_000;

        // Print 
        System.out.println("Age " + age);
        System.out.println("Year " + year);
        System.out.println("Marks " + marks);
        System.out.println("Population " + population);

        System.out.println("Salary " + salary);
        System.out.println("Pi " + pi);

        System.out.println("Grade " + grade);
        System.out.println("isPassed " + isPassed);

        System.out.println("Binary  " + binaryNum);
        System.out.println("Octal " + octalNum);
        System.out.println("Hexa " + hexaNum);

        System.out.println("Amount " + amount);
    }
}