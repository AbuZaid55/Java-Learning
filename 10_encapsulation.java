// Encapsulation is wrapping data and methods into a single unit (class) and protecting the data from direct access.

class StudentDetails {
    private String name;
    private int age;

    public String getDetails(){
        return "Name: " + name + ", Age: " + age;
    }

    public void setDetailsWithObject(String name, int age, StudentDetails student){
        student.name = name;
        student.age = age;
    }

    public void setDetailsWithThisKeyword(String name, int age){
        // use this keyword to refer same object
        this.name = name;
        this.age = age;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        // student.setDetailsWithObject("Abu Zaid", 24, student);
        student.setDetailsWithThisKeyword("Abu Zaid", 24);
        System.out.println(student.getDetails());
    }
}