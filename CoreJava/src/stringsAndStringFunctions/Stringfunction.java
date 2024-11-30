package stringsAndStringFunctions;

public class Stringfunction {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello World";

        // Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated: " + concatenated);

        // Length
        System.out.println("Length of str3: " + str3.length());

        // Character at a specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // Substring
        String substring = str3.substring(0, 5);
        System.out.println("Substring of str3 (0, 5): " + substring);

        // Index of a character or substring
        int index = str3.indexOf("World");
        System.out.println("Index of 'World' in str3: " + index);

        // Last index of a character or substring
        int lastIndex = str3.lastIndexOf('o');
        System.out.println("Last index of 'o' in str3: " + lastIndex);

        // Replace
        String replaced = str3.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replaced);

        // Trim (removes leading and trailing whitespace)
        String strWithSpaces = "   Hello World   ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());

        // Split
        String[] words = str3.split(" ");
        System.out.println("Split str3 into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Check if string contains a substring
        boolean contains = str3.contains("Hello");
        System.out.println("Does str3 contain 'Hello'? " + contains);

        // String comparison
        String str4 = "hello";
        System.out.println("str1 equals str4 (case-sensitive): " + str1.equals(str4));
        System.out.println("str1 equals str4 (case-insensitive): " + str1.equalsIgnoreCase(str4));

        // StringBuilder for mutable strings
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb.toString());

        // Inserting into StringBuilder
        sb.insert(5, ",");
        System.out.println("StringBuilder after insert: " + sb.toString());

        // Deleting from StringBuilder
        sb.delete(5, 6);
        System.out.println("StringBuilder after delete: " + sb.toString());

        // Reversing a StringBuilder
        sb.reverse();
        System.out.println("Reversed StringBuilder: " + sb.toString());

        // Converting StringBuilder back to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}