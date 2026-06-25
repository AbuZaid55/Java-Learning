class TypeConvNCasting { 
    public static void main(){
        // byte b = 127;
        // int a = 12;
        // a = b;  
        // System.out.println(a); //127

        // byte b = 127;
        // int a = 12;
        // b = (byte) a;
        // System.out.println(b); // 12

        // byte b = 127;
        // int a = 128;
        // b = (byte) a;
        // System.out.println(b); // -128

        // byte b = 127;
        // int a = 129;
        // b = (byte) a;
        // System.out.println(b); // -127

        // float f = 5.6f;
        // int x = (int) f;
        // System.out.println(x); // 5

        byte a = 10;
        byte b = 13;
        byte x = (byte) (a*b); // by default it multiply in int so 130 and it will convert in byte and give ans -126
        System.out.println(x); // -126


    }
}