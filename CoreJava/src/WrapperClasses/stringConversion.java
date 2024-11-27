package WrapperClasses;

public class stringConversion {

    public static void main(String[] args) {
        // Sample strings representing different primitive values
        String intString = "30";
        String doubleString = "20.5";
        String charString = "A"; // Note: for char, we will take the first character
        String booleanString = "true";
        String floatString = "15.5";
        String longString = "100";
        String byteString = "5";
        String shortString = "1000";

        // String to Primitive Conversion
        int intPrimitive = Integer.parseInt(intString);
        double doublePrimitive = Double.parseDouble(doubleString);
        char charPrimitive = charString.charAt(0); // Taking the first character
        boolean booleanPrimitive = Boolean.parseBoolean(booleanString);
        float floatPrimitive = Float.parseFloat(floatString);
        long longPrimitive = Long.parseLong(longString);
        byte bytePrimitive = Byte.parseByte(byteString);
        short shortPrimitive = Short.parseShort(shortString);

        // Output the primitive values
        System.out.println("Primitive Values (String to Primitive):");
        System.out.println("int: " + intPrimitive);
        System.out.println("double: " + doublePrimitive);
        System.out.println("char: " + charPrimitive);
        System.out.println("boolean: " + booleanPrimitive);
        System.out.println("float: " + floatPrimitive);
        System.out.println("long: " + longPrimitive);
        System.out.println("byte: " + bytePrimitive);
        System.out.println("short: " + shortPrimitive);

        // String to Wrapper Conversion
        Integer intWrapper = Integer.valueOf(intString);
        Double doubleWrapper = Double.valueOf(doubleString);
        Character charWrapper = charString.charAt(0); // Using char directly
        Boolean booleanWrapper = Boolean.valueOf(booleanString);
        Float floatWrapper = Float.valueOf(floatString);
        Long longWrapper = Long.valueOf(longString);
        Byte byteWrapper = Byte.valueOf(byteString);
        Short shortWrapper = Short.valueOf(shortString);

        // Output the wrapper values
        System.out.println("\nWrapper Values (String to Wrapper):");
        System.out.println("Integer: " + intWrapper);
        System.out.println("Double: " + doubleWrapper);
        System.out.println("Character: " + charWrapper);
        System.out.println("Boolean: " + booleanWrapper);
        System.out.println("Float: " + floatWrapper);
        System.out.println("Long: " + longWrapper);
        System.out.println("Byte: " + byteWrapper);
        System.out.println("Short: " + shortWrapper);
    }
}