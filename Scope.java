class Scope{
    // Class-level variable (instance variable)
    int instanceVar = 10;

    void methodScopeExample() {
        // Method-level variable (local variable)
        int methodVar = 20;

        System.out.println("Instance Variable (Class Scope): " + instanceVar);
        System.out.println("Method Variable (Method Scope): " + methodVar);

        // Block scope
        if (methodVar > 10) {
            int blockVar = 30; // Block-level variable
            System.out.println("Block Variable (Block Scope): " + blockVar);
        }

        
    }

    public static void main(String[] args) {
        Scope obj = new Scope();

        // Accessing class-level variable through an object
        System.out.println("Accessing Instance Variable from Main: " + obj.instanceVar);

        // Calling the method to demonstrate method and block scopes
        obj.methodScopeExample();

        
    }
}

