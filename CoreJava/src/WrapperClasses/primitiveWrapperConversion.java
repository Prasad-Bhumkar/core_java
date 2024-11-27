package WrapperClasses;

public class primitiveWrapperConversion {

    public static void main(String[] args) {
        // Declare primitive types
        int intPrimitive = 30;
        double doublePrimitive = 20.5;
        char charPrimitive = 'A';
        boolean booleanPrimitive = true;
        float floatPrimitive = 15.5f;
        long longPrimitive = 100L;
        byte bytePrimitive = 5;
        short shortPrimitive = 1000;

        // Boxing (Primitive to Wrapper Object) using constructor
        Integer intWrapper = new Integer(intPrimitive);
        Double doubleWrapper = new Double(doublePrimitive);
        Character charWrapper = new Character(charPrimitive);
        Boolean booleanWrapper = new Boolean(booleanPrimitive);
        Float floatWrapper = new Float(floatPrimitive);
        Long longWrapper = new Long(longPrimitive);
        Byte byteWrapper = new Byte(bytePrimitive);
        Short shortWrapper = new Short(shortPrimitive);

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

        // Unboxing (Wrapper Object to Primitive) using methods
        int unboxedInt = intWrapper.intValue();
        double unboxedDouble = doubleWrapper.doubleValue();
        char unboxedChar = charWrapper.charValue();
        boolean unboxedBoolean = booleanWrapper.booleanValue();
        float unboxedFloat = floatWrapper.floatValue();
        long unboxedLong = longWrapper.longValue();
        byte unboxedByte = byteWrapper.byteValue();
        short unboxedShort = shortWrapper.shortValue();

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
    }
}