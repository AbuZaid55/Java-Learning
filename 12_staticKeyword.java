class Mobile {
    String brand;
    int price;
    static String name; // static - common for all object

    static {
        // it run only once when first object created. not like constructor that are run on each object creation
        // so here we can assign value to all static variables
        name = "Abu Zaid";
    }

    public void show(){
        System.out.println(brand + " - " + price + " - " + name);
    }

    public static void show1(Mobile obj){
        // here for brand and price we need to give object refrance because this show1 method is static so it will common for all object. even we can not use this keywords
        // but here name don't need to give object refrance because name is static variable so it will be commond for all object
        System.out.println(obj.brand + " - " + obj.price + " - " + name);
    } 
    
}
class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        obj1.name = "iPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 150000;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show(); // both will give SmartPhone because if we change static variable then it will change for all object

        System.out.println(Mobile.name); // static variable and  method can be called using class name
        Mobile.show1(obj2);
        
    }
}