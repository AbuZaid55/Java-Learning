// using thorw keyword we can throw Exception
// using throws (*s) keyword we can thow multiple Exception
// The throws keyword passes the responsibility of handling an exception to the calling method. and its called "Exception Ducking".

class MyException extends Exception {
    public MyException (String exception){
        super(exception);
    }
}
class Test {
    void show() throws ClassNotFoundException{ // here for handling exception we are giving responsibility to calling method.
        Class.forName("Calc"); // this is used to load a class but there is no class name is Calc so it will throw class not found exception.
    }
}
class ThrowKeyword {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try {
            if(b == 0){
                throw new ArithmeticException("Value of b can not be zero");
            }else if (b>a){
                throw new MyException("Value of b can not be greater than value of a");
            }
            int result = a/b;
            System.out.println(result);

        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception => " + e);

        } catch(MyException e){
            System.out.println("My Exception => "+ e);

        } catch (Exception e) {
            System.out.println("Exception => "+ e);
        }


        Test test = new Test();
        try {
            test.show(); // for show method we have to handling exception
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found Exception => "+ e);

        } catch (Exception e) {
           System.out.println("Exception => "+ e);
        }
    }
}
