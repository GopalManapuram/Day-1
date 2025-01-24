class DefaultValues {
    // Instance variables
    int intVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    // Static variables
    static int staticIntVar;
    static String staticStringVar;

    public static void main(String[] args) {
        
        DefaultValues obj = new DefaultValues();

        
        System.out.println("Default values of instance variables:");
        System.out.println("int: " + obj.intVar);
        System.out.println("double: " + obj.doubleVar);
        System.out.println("char: '" + obj.charVar + "'"); 
        System.out.println("boolean: " + obj.booleanVar);

        
        System.out.println("\nDefault values of static variables:");
        System.out.println("static int: " + DefaultValues.staticIntVar);
        System.out.println("static String: " + DefaultValues.staticStringVar);
    }
}

