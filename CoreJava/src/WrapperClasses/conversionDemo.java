package WrapperClasses;

public class conversionDemo {

    public static void main(String[] args) {
        // Demonstrating Conversion between Primitive Types and Wrapper Classes

        // Initializing primitive types
        int intPrimitive = 30;
        double doublePrimitive = 20.5;
        char charPrimitive = 'A';
        boolean booleanPrimitive = true;
        float floatPrimitive = 15.5f;
        long longPrimitive = 100L;
        byte bytePrimitive = 5;
        short shortPrimitive = 1000;

        // Boxing: Converting primitive types to their corresponding wrapper classes
        Integer intWrapper = Integer.valueOf(intPrimitive); // Recommended way
        Double doubleWrapper = Double.valueOf(doublePrimitive);
        Character charWrapper = charPrimitive; // Auto-boxing
        Boolean booleanWrapper = Boolean.valueOf(booleanPrimitive);
        Float floatWrapper = Float.valueOf(floatPrimitive);
        Long longWrapper = Long.valueOf(longPrimitive);
        Byte byteWrapper = Byte.valueOf(bytePrimitive);
        Short shortWrapper = Short.valueOf(shortPrimitive);

        // Output the boxed values
        System.out.println("Boxed Values (Primitive to Wrapper):");
        System.out.println("Integer: " + intWrapper);
        System.out.println("Double: " + doubleWrapper);
        System.out.println("Character: " + charWrapper);
        System.out.println("Boolean: " + booleanWrapper);
        System.out.println("Float: " + floatWrapper);
        System.out.println("Long: " + longWrapper);
        System.out.println("Byte: " + byteWrapper);
        System.out.println("Short: " + shortWrapper);

        // Unboxing: Converting wrapper classes back to their corresponding primitive types
        int unboxedInt = intWrapper; // Auto-unboxing
        double unboxedDouble = doubleWrapper; // Auto-unboxing
        char unboxedChar = charWrapper; // Auto-unboxing
        boolean unboxedBoolean = booleanWrapper; // Auto-unboxing
        float unboxedFloat = floatWrapper; // Auto-unboxing
        long unboxedLong = longWrapper; // Auto-unboxing
        byte unboxedByte = byteWrapper; // Auto-unboxing
        short unboxedShort = shortWrapper; // Auto-unboxing

        // Output the unboxed values
        System.out.println("\nUnboxed Values (Wrapper to Primitive):");
        System.out.println("int: " + unboxedInt);
        System.out.println("double: " + unboxedDouble);
        System.out.println("char: " + unboxedChar);
        System.out.println("boolean: " + unboxedBoolean);
        System.out.println("float: " + unboxedFloat);
        System.out.println("long: " + unboxedLong);
        System.out.println("byte: " + unboxedByte);
        System.out.println("short: " + unboxedShort);

        // Sample strings for conversion
        String intString = "30";
        String doubleString = "20.5";
        String charString = "A"; // For char, we will take the first character
        String booleanString = "true";
        String floatString = "15.5";
        String longString = "100";
        String byteString = "5";
        String shortString = "1000";

        // Converting Strings to Primitive Types
        int intPrimitiveFromStr = Integer.parseInt(intString);
        double doublePrimitiveFromStr = Double.parseDouble(doubleString);
        char charPrimitiveFromStr = charString.charAt(0); // Extracting the first character
        boolean booleanPrimitiveFromStr = Boolean.parseBoolean(booleanString);
        float floatPrimitiveFromStr = Float.parseFloat(floatString);
        long longPrimitiveFromStr = Long.parseLong(longString);
        byte bytePrimitiveFromStr = Byte.parseByte(byteString);
        short shortPrimitiveFromStr = Short.parseShort(shortString);

        // Output the primitive values derived from strings
        System.out.println("\nPrimitive Values (String to Primitive):");
        System.out.println("int: " + intPrimitiveFromStr);
        System.out.println("double: " + doublePrimitiveFromStr);
        System.out.println("char: " + charPrimitiveFromStr);
        System.out.println("boolean: " + booleanPrimitiveFromStr);
        System.out.println("float: " + floatPrimitiveFromStr);
        System.out.println("long: " + longPrimitiveFromStr);
        System.out.println("byte: " + bytePrimitiveFromStr);
        System.out.println("short: " + shortPrimitiveFromStr);

        // Converting Strings to Wrapper Classes
        Integer intWrapperFromStr = Integer.valueOf(intString);
        Double doubleWrapperFromStr = Double.valueOf(doubleString);
        Character charWrapperFromStr = charString.charAt(0 ); // Extracting the first character
        Boolean booleanWrapperFromStr = Boolean.valueOf(booleanString);
        Float floatWrapperFromStr = Float.valueOf(floatString);
        Long longWrapperFromStr = Long.valueOf(longString);
        Byte byteWrapperFromStr = Byte.valueOf(byteString);
        Short shortWrapperFromStr = Short.valueOf(shortString);

        // Output the wrapper values derived from strings
        System.out.println("\nWrapper Values (String to Wrapper):");
        System.out.println("Integer: " + intWrapperFromStr);
        System.out.println("Double: " + doubleWrapperFromStr);
        System.out.println("Character: " + charWrapperFromStr);
        System.out.println("Boolean: " + booleanWrapperFromStr);
        System.out.println("Float: " + floatWrapperFromStr);
        System.out.println("Long: " + longWrapperFromStr);
        System.out.println("Byte: " + byteWrapperFromStr);
        System.out.println("Short: " + shortWrapperFromStr);
    }
}