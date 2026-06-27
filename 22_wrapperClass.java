class WarpperClass {
    public static void main(String[] args) {

        int num = 7;

        Integer num1 = new Integer(num); // boxing
        Integer num2 = num; // autoboxing
        System.out.println(num1);
        System.out.println(num2);

        int num3 = num2.intValue(); // unboxing
        int num4 = num2; // autounboxing
        System.out.println(num3);
        System.out.println(num4);

        String str = "12";
        int strInInt = Integer.parseInt(str);
        System.out.println(strInInt*5); // 60
    }
}

// A wrapper class is a class that wraps a primitive data type into an object.

// Java provides a wrapper class for each primitive type that makes java 99.99% object oriented programming language .

// | Primitive Type | Wrapper Class |
// | -------------- | ------------- |
// | `byte`         | `Byte`        |
// | `short`        | `Short`       |
// | `int`          | `Integer`     |
// | `long`         | `Long`        |
// | `float`        | `Float`       |
// | `double`       | `Double`      |
// | `char`         | `Character`   |
// | `boolean`      | `Boolean`     |
