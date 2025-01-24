class Static{
    // Static variable (shared by all instances, stored in the Class Area)
    static int staticCounter = 0;

    // Instance variable (unique to each object, stored in the Heap)
    int instanceCounter = 0;

    // Constructor to increment both counters
    Static() {
        staticCounter++;  // Increment static variable (shared)
        instanceCounter++;  // Increment instance variable (unique to each object)
    }

    void displayCounters() {
        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("Creating first object:");
        Static obj1 = new Static();
        obj1.displayCounters();

        System.out.println("\nCreating second object:");
        Static obj2 = new Static();
        obj2.displayCounters();

        System.out.println("\nAccessing static counter directly:");
        System.out.println("Static Counter (Class-level): " + Static.staticCounter);

        System.out.println("\nCreating third object:");
        Static obj3 = new Static();
        obj3.displayCounters();
    }
}

