class Var{
    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    // Method to demonstrate local variable
    void showVariables() {
        // Local variable
        int localVar = 30;
        
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
    public static void main(String args[]){
        Var obj = new Var();

        // Accessing and printing variables
        obj.showVariables();

        // Accessing static variable without an object
        System.out.println("Static Variable (accessed directly): " + Var.staticVar);
    }
}

