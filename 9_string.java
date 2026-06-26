class StringClass {
    public static void main(String[] args) {
        String name = "Abu Zaid";
        System.out.println(name);

        String name2 = new String("Abu Zaid");
        System.out.println(name2);

        // String Constant Pool (SCP)
        // Stores duplicate string literals only once.
        // If two or more variables have the same string literal,
        // they all reference the same String object in the SCP.
        //
        // Example:
        String s1 = "Abu Zaid";
        String s2 = "Abu Zaid";

        s1 = "ABUZAID";
        // A new String literal "ABUZAID" is created (or reused if it already exists)
        // in the String Constant Pool, and s1 now references it.
        // The original "Abu Zaid" object is not modified because Strings are immutable.

        System.out.println(s1); // ABUZAID
        System.out.println(s2); // Abu Zaid

        // StringBuffer is used when we need a mutable (modifiable) string.
        // If created with no initial value, its default capacity is 16 characters.
        // If created with a string, capacity = string length + 16.
        // StringBuffer automatically increases its capacity when needed.

        StringBuffer strbuff = new StringBuffer("String Buffer");

        System.out.println(strbuff);
        System.out.println(strbuff.length()); // 13
        System.out.println(strbuff.capacity()); // 29 (13 + 16)

        strbuff.append(" give mutable string");
        System.out.println(strbuff);

    }
}