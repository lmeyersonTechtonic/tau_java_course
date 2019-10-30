package chapter8;

import java.util.Map;

public class TextProcesser {

    public static void main(String[] args) {
        countWords("I love test automation university");
        reverseString("Hello, TAU!");
        addSpaces("HeyWorld!It'sMeAngie");
    }

//    Map<String, String>

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numOfWords = words.length;

        String message = String.format("You text contains %d words:", numOfWords);
        System.out.println(message);
        for(String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Print a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        var reversedString = "";
        for(int i = 0; i < text.length(); i++) {
         reversedString = text.charAt(i) + reversedString;
        }
        System.out.println(reversedString);
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i !=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
