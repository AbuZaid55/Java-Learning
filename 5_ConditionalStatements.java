class ConditionalStatements {
    public static void main(String[] args) {
        int marks = 40;

        // if else statemet
        if (marks > 60) {
            System.out.println("First");
        } else if (marks <= 60 && marks > 30) {
            System.out.println("Second");
        } else {
            System.out.println("Third");
        }

        // ternary operator
        String result = marks > 60 ? "First" : marks <= 60 && marks > 30 ? "Second" : "Third";
        System.out.println(result);


        // Switch Statement
        switch (marks) {
            case 100:
                System.out.println("Perfect");
                break;
            case 90:
                System.out.println("Excellent");
                break;
            case 60:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Other");
        }
    }
}