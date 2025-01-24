import java.util.Scanner;

class Circle {
    // Constant for Pi
    static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        
        System.out.println("\nResults:");
        System.out.printf("Area of the circle: %.2f%n", area);
        System.out.printf("Circumference of the circle: %.2f%n", circumference);
        
        scanner.close();
    }
}

