class Finalvariable {
    // Final instance variable
    final int instanceVar = 100;

    // Final static variable
    static final int staticVar = 200;

    void showFinalVariables() {
        // Final local variable
        final int localVar = 300;

        System.out.println("Final Instance Variable: " + instanceVar);
        System.out.println("Final Static Variable: " + staticVar);
        System.out.println("Final Local Variable: " + localVar);

        
    }

    public static void main(String[] args) {
        Finalvariable obj = new Finalvariable();

        // Access final instance variable
        System.out.println("Accessing Final Instance Variable from Main: " + obj.instanceVar);

        // Access final static variable
        System.out.println("Accessing Final Static Variable from Main: " + Finalvariable.staticVar);

        
        obj.showFinalVariables();
    }
}

