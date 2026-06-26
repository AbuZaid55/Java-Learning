class StudentDetails {
    private String name;
    private int age;

    // this is constructor. in constructor there is no return type and its run with object create.
    // if we dont give any constructor still in each class there is default constructor
    public StudentDetails(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor run");
    }

    public String getDetails(){
        return "Name: " + name + ", Age: " + age;
    }
}

class Constructor {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails("Zaid", 24);
        System.out.println(student.getDetails());
       
    }
}