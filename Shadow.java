public class Shadow {
    // Class-level variable
    static String message = "Class-level message";

    public static void main(String[] args) {
        System.out.println("Class-level message: " + message); // Accessing class-level variable

        // Shadowing in method
        String message = "Method-level message";
        System.out.println("Method-level message: " + message);

        // Shadowing in block with a different variable name
        {
            String blockMessage = "Block-level message";
            System.out.println("Block-level message: " + blockMessage);
        }

        // Accessing method-level variable after block
        System.out.println("Method-level message after block: " + message);

        // Shadowing using method parameter
        shadowMethod("Parameter-level message");
    }

    // Method demonstrating parameter shadowing
    public static void shadowMethod(String message) {
        System.out.println("Method parameter message: " + message);

        // Accessing the class-level variable using class name
        System.out.println("Accessing class-level variable inside method: " + Shadow.message);
    }
}

