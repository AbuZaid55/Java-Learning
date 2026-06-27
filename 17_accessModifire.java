import accessModifire.A;
import accessModifire.B;

class Test extends A {
    public void showMarks() {
        System.out.println(marks);  // protected can be access in subclass or different package
    }
}

class AccessModifire {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // System.out.println(a.marks); // protected can not be access in different package
        Test test = new Test();
        test.showMarks();
        a.showAge(); // private can be access only in same class
        b.showRollno(); // default can be access in same class and in same package so here b is in same package of A;


    }
}

// +---------------------------+------------+--------------+------------------------------+------------------------------+
// | Access Modifier           | Same Class | Same Package | Subclass (Different Package) | Different Package            |
// +---------------------------+------------+--------------+------------------------------+------------------------------+
// | public                   | Yes        | Yes          | Yes                          | Yes                          |
// | protected                | Yes        | Yes          | Yes                          | No                           |
// | default (no modifier)    | Yes        | Yes          | No                           | No                           |
// | private                  | Yes        | No           | No                           | No                           |
// +---------------------------+------------+--------------+------------------------------+------------------------------+

