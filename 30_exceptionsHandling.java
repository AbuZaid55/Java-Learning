class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int nums[] = new int[5];
        try {
            // int result = a/b;
            // System.out.println(result);

            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception => " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception => " + e);
            
        } catch (Exception e) {
            System.out.println("Exception => " + e);
        }
    }
}