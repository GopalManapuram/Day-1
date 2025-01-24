class Primitivereference {
    public static void main(String[] args) {
        // Primitive variable
        int primitiveVar1 = 10;
        int primitiveVar2 = primitiveVar1; 

        System.out.println("Before modifying primitiveVar2:");
        System.out.println("primitiveVar1: " + primitiveVar1);
        System.out.println("primitiveVar2: " + primitiveVar2);

        
        primitiveVar2 = 20;
        System.out.println("\nAfter modifying primitiveVar2:");
        System.out.println("primitiveVar1: " + primitiveVar1);
        System.out.println("primitiveVar2: " + primitiveVar2);

        // Reference variable
        int[] referenceVar1 = {1, 2, 3};
        int[] referenceVar2 = referenceVar1; 

        System.out.println("\nBefore modifying referenceVar2:");
        System.out.println("referenceVar1: " + java.util.Arrays.toString(referenceVar1));
        System.out.println("referenceVar2: " + java.util.Arrays.toString(referenceVar2));

      
        referenceVar2[0] = 10;
        System.out.println("\nAfter modifying referenceVar2:");
        System.out.println("referenceVar1: " + java.util.Arrays.toString(referenceVar1));
        System.out.println("referenceVar2: " + java.util.Arrays.toString(referenceVar2));
    }
}
