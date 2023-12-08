/*
CZ
12/11/23
HK
 */
public class Main {
    public static void main(String[] args) {
        ArrayDictionary<String, Integer> dictionary = new ArrayDictionary<>();

        // Put key-value pairs into the dictionary
        dictionary.put("one", 1);
        dictionary.put("two", 2);
        dictionary.put("three", 3);

        // Display the dictionary
        System.out.println("Dictionary:");
        displayDictionary(dictionary);

        // Get values by key
        System.out.println("\nValue for key 'two': " + dictionary.get("two"));

        // Remove a key-value pair
        System.out.println("\nRemoving key 'two'");
        Integer removedValue = dictionary.remove("two");
        System.out.println("Removed value: " + removedValue);
        displayDictionary(dictionary);

        // Check if the dictionary contains a key
        System.out.println("\nContains key 'one': " + dictionary.contains("one"));
        System.out.println("Contains key 'two': " + dictionary.contains("two"));

        // Check if the dictionary is empty
        System.out.println("\nIs dictionary empty? " + dictionary.isEmpty());

        // Display the size of the dictionary
        System.out.println("\nSize of the dictionary: " + dictionary.size());

        // Display keys and values
        System.out.println("\nKeys: " + dictionary.keys());
        System.out.println("Values: " + dictionary.values());
    }

    private static void displayDictionary(ArrayDictionary<String, Integer> dictionary) {
        System.out.println("Size: " + dictionary.size());
        System.out.println("Keys: " + dictionary.keys());
        System.out.println("Values: " + dictionary.values());
    }
}