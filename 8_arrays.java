class Student {
    int rollno;
    String name;
    int marks;
}

class Arrays {
    public static void main(String[] args) {
        // int num[] = {5,6,7};
        // num[1] = 100;
        // for (int i = 0; i< num.length; i++){
        //     System.out.println(num[i]);
        // }

        int nums [][] = new int[3][4];
        // add value
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                int randomValue = (int) (Math.random() * 10);
                nums[i][j] = randomValue;
            }
        }
        // print value 
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        

        // Jagged array where column is not fixed, so we have to give column length after initialize
        int jagged[][] = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        // add value
        for (int i = 0; i< jagged.length ; i ++){
            for (int j=0;j<jagged[i].length; j++){
                int randomValue = (int) (Math.random() * 10);
                jagged[i][j] = randomValue;
            }
        }
        // print value
        System.out.println("===== Jagged Array =====");
        for (int i = 0; i< jagged.length ; i ++){
            for (int j=0;j<jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // three dimensional jagged array
        // int threedimJaggedArray[][][] = new int[3][][];
        
        // Array with object
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "First";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Second";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Third";
        s3.marks = 70;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        for (int i = 0; i<student.length; i++){
            System.out.println(student[i].rollno + " " + student[i].name + " " + student[i].marks);
        }

        // foreach loop
        for (Student s: student){
            System.err.println(s.name + " " + s.rollno + " " + s.marks);
        }
    }
}